package com.alexis.react.controller;

import com.alexis.react.model.User;
import com.alexis.react.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("api/")

public class EmployeeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    }
}
