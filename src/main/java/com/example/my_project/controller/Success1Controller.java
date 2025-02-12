package com.example.my_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Success1Controller {

    @GetMapping("/success1")
    public String successPage1() {
        return "success1.html";  // This will look for success.html inside src/main/resources/templates/
    }
}
