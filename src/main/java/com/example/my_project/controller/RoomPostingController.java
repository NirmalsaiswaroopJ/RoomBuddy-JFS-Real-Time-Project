package com.example.my_project.controller;

import com.example.my_project.dto.RoomPostingDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

@RestController
@RequestMapping("/search-buddies")
public class RoomPostingController {
    private final JdbcTemplate jdbcTemplate;
    private final ObjectMapper objectMapper; // JSON Serializer

    public RoomPostingController(JdbcTemplate jdbcTemplate, ObjectMapper objectMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public String findByCity(@RequestParam String city) {
        String sql = "SELECT full_name, city, rent, description, phone FROM room_postings WHERE city = ?";
        List<RoomPostingDTO> results = jdbcTemplate.query(sql, new Object[]{city}, (rs, rowNum) -> 
            new RoomPostingDTO(
                rs.getString("full_name"),
                rs.getString("city"),
                rs.getDouble("rent"),
                rs.getString("description"),
                rs.getString("phone")
            )
        );

        // Debugging: Print the results
        System.out.println("Fetched Listings from DB: " + results);

        try {
            return objectMapper.writeValueAsString(results); // Manually convert to JSON
        } catch (Exception e) {
            e.printStackTrace();
            return "[]"; // Return an empty JSON array if there's an error
        }
    }
}
