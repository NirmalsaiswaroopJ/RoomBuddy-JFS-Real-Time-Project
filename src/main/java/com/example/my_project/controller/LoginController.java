package com.example.my_project.controller;

import com.example.my_project.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login.html";  // Ensure login.html exists in src/main/resources/templates/
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, 
                               @RequestParam String password, HttpSession session, 
                               Model model) {
        if (userRepository.validateUser(username, password)) {
            session.setAttribute("loggedInUser", username);
            return "redirect:/userhomepage"; // Redirect on success
        } else {
            model.addAttribute("error", "Invalid username or password");
            return ""; // Stay on login page with error message
        }
    }

    @GetMapping("/userhomepage")
    public String userHome() {
        return "userhomepage.html"; // Ensure this exists in src/main/resources/templates/
    }
}
