package com.example.demo.controller;

import com.example.demo.dao.HierarchyRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Hierarchy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HierarchyController {

    @Autowired
    private HierarchyRepository hierarchyRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users/{usr_no}/hierarchys")
    public Optional<Hierarchy> getHierarchyByUsr_no(@PathVariable Long usr_no){

        return  hierarchyRepository.findById(usr_no);
    }


    @PostMapping("/users/{usr_no}/hierarchys")
    public Hierarchy addHierarchy(@PathVariable Long usr_no, @Valid @RequestBody Hierarchy hierarchy){

        return userRepository.findById(usr_no).map(user -> {
            hierarchy.setUser(user);
            return hierarchyRepository.save(hierarchy);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + usr_no));

    }

    @PutMapping("/users/{usr_no}/hierarchys/{hrchy_code}")
    public Hierarchy updateHierarchy(@PathVariable Long usr_no,
                                     @PathVariable Long hrchy_code,
                                     @Valid @RequestBody Hierarchy hierarchyRequest) {
        if (!userRepository.existsById(usr_no)){
            throw new ResourceNotFoundException("User not found with id " + usr_no);
        }

        return hierarchyRepository.findById(hrchy_code).map(hierarchy -> {
            hierarchy.setHrchy_l_nm(hierarchyRequest.getHrchy_l_nm());
            hierarchy.setHrchy_f_nm(hierarchyRequest.getHrchy_f_nm());
            hierarchy.setHrchy_code_parnt(hierarchyRequest.getHrchy_code_parnt());
            hierarchy.setHrchy_typ(hierarchyRequest.getHrchy_typ());
            hierarchy.setLvl_no(hierarchyRequest.getLvl_no());
            hierarchy.setInactv_flg(hierarchyRequest.getInactv_flg());
            hierarchy.setInactv_usr_no(hierarchyRequest.getInactv_usr_no());
            hierarchy.setInactv_date(hierarchyRequest.getInactv_date());
            hierarchy.setInactv_dsc(hierarchyRequest.getInactv_dsc());
            return hierarchyRepository.save(hierarchy);
        }).orElseThrow(()-> new ResourceNotFoundException("Hierarchy not found with id " + hrchy_code));

        }

        @DeleteMapping("/users/{usr_no}/hierarchys/{hrchy_code}")
        public ResponseEntity<?> deleteHierarchy(@PathVariable Long usr_no,
                                                 @PathVariable Long hrchy_code){


            if (!userRepository.existsById(usr_no)){
                throw  new ResourceNotFoundException("User not found with id " + usr_no);
            }


            return hierarchyRepository.findById(hrchy_code).map(hierarchy -> {
                hierarchyRepository.delete(hierarchy);
                return ResponseEntity.ok().build();
            }).orElseThrow(()-> new ResourceNotFoundException("Hierarcy not found with id " + hrchy_code));
        }

    }

