package com.example.my_project.controller;

import com.example.my_project.entity.User;
import com.example.my_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public String registerUser(@RequestParam String username,
                               @RequestParam String email,
                               @RequestParam String password,
                               @RequestParam String phone) {

        User user = new User(username, email, password, phone);
        userRepository.saveUser(user);

        return "redirect:/success"; // Redirect after registration
    }
}
