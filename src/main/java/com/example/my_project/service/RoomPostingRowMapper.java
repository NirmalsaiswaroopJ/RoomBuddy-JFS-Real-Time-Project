package com.example.my_project.service;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.my_project.entity.RoomPosting;

public class RoomPostingRowMapper implements RowMapper<RoomPosting> {
    @Override
    public RoomPosting mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new RoomPosting( // Ensure ID is mapped if needed
            rs.getString("full_name"),
            rs.getString("city"),
            rs.getDouble("rent"),
            rs.getString("description"),
            rs.getString("phone")
        );
    }
}

