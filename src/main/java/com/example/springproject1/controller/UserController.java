package com.example.springproject1.controller;

import com.example.springproject1.entity.User;
import com.example.springproject1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // to make avaiable for spring container
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService=userService;
    }

    @GetMapping("/userDetails")
    public ResponseEntity<String> getUserDetails()
    {
        User user=userService.userDetails();
        return new ResponseEntity<>(user.toString(), HttpStatus.OK);
    }

}
