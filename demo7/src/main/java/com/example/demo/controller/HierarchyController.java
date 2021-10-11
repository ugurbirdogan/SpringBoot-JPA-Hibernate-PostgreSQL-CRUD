package com.example.demo.controller;

import com.example.demo.model.Hierarchy;
import com.example.demo.service.HierarchyService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HierarchyController {

    @Autowired
    private HierarchyService hierarchyService;

    @Autowired
    private UserService userService;

    @GetMapping("/users/{usr_no}/hierarchys")
    public Optional<Hierarchy> getHierarchyByUsr_no(@PathVariable Long usr_no){

        return hierarchyService.getHierarchyByUsr_no(usr_no);
    }

    @PostMapping("/users/{usr_no}/hierarchys")
    public Hierarchy addHierarchy(@PathVariable Long usr_no, @Valid @RequestBody Hierarchy hierarchy){

        return hierarchyService.addHierarchy(usr_no,hierarchy);
    }

    @PutMapping("/users/{usr_no}/hierarchys/{hrchy_code}")
    public Hierarchy updateHierarchy(@PathVariable Long usr_no,
                                     @PathVariable Long hrchy_code,
                                     @Valid @RequestBody Hierarchy hierarchyRequest){

        return hierarchyService.updateHierarchy(usr_no,hrchy_code,hierarchyRequest);
    }

    @DeleteMapping("/users/{usr_no}/hierarchys/{hrchy_code}")
    public ResponseEntity<?> deleteHierarchy(@PathVariable Long usr_no,
                                             @PathVariable Long hrchy_code){

        return hierarchyService.deleteHierarchy(usr_no,hrchy_code);
    }
}
