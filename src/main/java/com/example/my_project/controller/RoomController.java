package com.example.my_project.controller;

import com.example.my_project.entity.RoomPosting;
import com.example.my_project.repository.RoomPostingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomPostingRepository roomPostingRepository;

    @PostMapping
    public String postRoom(@RequestParam String fullName,
                           @RequestParam String city,
                           @RequestParam double rent,
                           @RequestParam String description,
                           @RequestParam String phone) {

        RoomPosting roomPosting = new RoomPosting(fullName, city, rent, description, phone);
        roomPostingRepository.saveRoomPosting(roomPosting);

        return "redirect:/success1"; // Redirect after posting a room
    }
}
