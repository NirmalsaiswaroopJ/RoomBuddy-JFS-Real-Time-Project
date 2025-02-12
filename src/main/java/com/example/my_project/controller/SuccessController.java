package com.example.my_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuccessController {

    @GetMapping("/success")
    public String successPage() {
        return "success.html";  // This will look for success.html inside src/main/resources/templates/
    }
}
