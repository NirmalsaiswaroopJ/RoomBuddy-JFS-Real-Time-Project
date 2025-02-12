package com.example.my_project.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoomPosting {
    private String fullName;
    private String city;
    private double rent;
    private String description;
    private String phone;

    // Constructors
    public RoomPosting() {}

    public RoomPosting(String fullName, String city, double rent, String description, String phone) {
        this.fullName = fullName;
        this.city = city;
        this.rent = rent;
        this.description = description;
        this.phone = phone;
    }

    @JsonProperty
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    @JsonProperty
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    @JsonProperty
    public double getRent() { return rent; }
    public void setRent(double rent) { this.rent = rent; }

    @JsonProperty
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @JsonProperty
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
