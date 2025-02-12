package com.example.my_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String homePage() {
        return "index.html";  // Ensure index.html exists in src/main/resources/templates/
    }
}
