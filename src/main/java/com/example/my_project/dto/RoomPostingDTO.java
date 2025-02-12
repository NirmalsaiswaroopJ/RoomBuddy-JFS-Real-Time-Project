package com.example.my_project.dto;

public class RoomPostingDTO {
    private String fullName;
    private String city;
    private double rent;
    private String description;
    private String phone;

    public RoomPostingDTO(String fullName, String city, double rent, String description, String phone) {
        this.fullName = fullName;
        this.city = city;
        this.rent = rent;
        this.description = description;
        this.phone = phone;
    }

    public String getFullName() { return fullName; }
    public String getCity() { return city; }
    public double getRent() { return rent; }
    public String getDescription() { return description; }
    public String getPhone() { return phone; }

    @Override
    public String toString() {
        return "RoomPostingDTO{" +
                "fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                ", rent=" + rent +
                ", description='" + description + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
