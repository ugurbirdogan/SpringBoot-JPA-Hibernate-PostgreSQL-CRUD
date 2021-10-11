package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public Page<User> getUser(Pageable pageable){

        return userService.getUser(pageable);
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user){

        return userService.createUser(user);
    }

    @PutMapping("/users/{usr_no}")
    public User updateUser(@PathVariable  Long usr_no,
                           @Valid @RequestBody User userRequest){

        return userService.updateUser(usr_no,userRequest);
    }

    @DeleteMapping("/users/{usr_no}")
    public ResponseEntity<?> deleteUser(@PathVariable Long usr_no){

        return userService.deleteUser(usr_no);
    }

}
