# RoomBuddy-JFS-Real-Time-Project

**RoomBuddy** is a dynamic web platform designed to help individuals find compatible roommates and rental listings based on their city and preferences. With real-time listings, secure authentication, and an intuitive interface, RoomBuddy simplifies the process of connecting people looking for shared accommodations.

## Table of Contents

- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Folder Structure](#folder-structure)
- [Spring Boot Initializer Configuration](#spring-boot-initializer-configuration)
- [Implementation Guide](#implementation-guide)
- [Problem Statement and Solution](#problem-statement-and-solution)
- [Live Demo](#live-demo)
- [Contributing](#contributing)
- [Acknowledgements](#acknowledgements)

## Project Overview

Finding a compatible roommate can be a challenging task. RoomBuddy aims to streamline this process by providing a platform where users can:

- **Search Listings by City**: Filter available rooms and roommates effortlessly.
- **Post & Manage Room Listings**: List your available space with details like rent and contact info.
- **Secure Login & Registration**: Authenticate users safely with password recovery options.
- **Interactive UI**: A clean and responsive design using Bootstrap.
- **Real-time Data Fetching**: Fast and efficient updates with dynamic search functionality.
- **Contact Room Owners**: Easily get in touch with potential roommates.

## Technologies Used

### **Frontend**
- HTML5
- CSS3
- JavaScript
- Bootstrap 5

### **Backend**
- Java
- Spring Boot
- JDBC

### **Database**
- MySQL

### **Version Control**
- GitHub

## Folder Structure

```plaintext
RoomBuddy/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── roombuddy/
│   │   │               ├── config/
│   │   │               ├── controller/
│   │   │               ├── dto/
│   │   │               ├── entity/
│   │   │               ├── repository/
│   │   │               └── service/
│   │   ├── resources/
│   │       ├── static/
│   │       └── application.properties
│   └── test/
├── .gitignore
├── HELP.md
├── LICENSE
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

- **`config/`**: Contains configuration classes such as security configurations, and any custom beans used in the application.
- **`controller/`**: Contains the REST controllers handling HTTP requests.
- **`dto/`**: Contains Data Transfer Objects (DTOs) that are used to transfer data between layers (e.g., between controllers and services) without exposing the full entity models.
- **`entity/`**: Contains the data models representing entities.
- **`repository/`**: Contains the data access logic.
- **`service/`**: Contains the business logic.
- **`static/`**: Contains static assets like CSS, JavaScript, and images.
- **`application.properties`**: Configuration properties for the application.

## Spring Boot Initializer Configuration

The project was initialized using **Spring Initializr** with the following settings:

- **Project**: Maven Project  
- **Language**: Java  
- **Spring Boot**: 2.5.4  
- **Packaging**: Jar  
- **Java**: 11  

### **Dependencies**
- Spring Web  
- Spring Data JPA  
- MySQL Driver   
- Spring Security  

---

## Implementation Guide

To set up and run the **RoomBuddy** project locally:

### **1. Clone the Repository**
```bash
git clone https://github.com/NirmalsaiswaroopJ/RoomBuddy-JFS-Real-Time-Project.git
cd RoomBuddy-JFS-Real-Time-Project
```

### **2. Configure the Database

- Ensure you have **MySQL** installed and running.
- Create a database named **`roombuddy`**.
- Update the **`application.properties`** file with your database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/roombuddy
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### **3. Build and Run the Application

Run the following commands to **build and start** the application:

```bash
./mvnw clean install
./mvnw spring-boot:run
```

### **4. Access the Application

Once the application is running, navigate to:

```bash
http://localhost:8080
```
in your browser.

## Problem Statement and Solution

### **Problem**
Finding a **compatible roommate** can be **time-consuming** and **challenging**, often involving multiple platforms and manual searches.

### **Solution**
**RoomBuddy** addresses this issue by providing a **centralized platform** where users can:

- 🔍 **Search** for available rooms in their desired city.
- 🏠 **Post listings** for available rooms with detailed information.
- 📞 **Connect** with potential roommates through provided contact information.
- ⚙️ **Manage their listings and profiles** through a **user-friendly interface**.

This **streamlined approach** saves time and increases the chances of finding a suitable living arrangement.

---

## Live Demo

Static Webpage - [https://roombuddyjfs.netlify.app/]

> *Note: Only showcased to understand the navigation and web application workflow.*

## Contributing

Thank you for considering contributing to **RoomBuddy**! 🎉  
I welcome **suggestions, bug reports, and pull requests**.

### To contribute:

1. **Fork** the repository.
2. **Create a new branch:**
   ```bash
   git checkout -b feature/YourFeature
   ```
3. **Commit your changes:**
   ```bash
   git commit -m "Add YourFeature"
   ```
4. **Push to the branch:**
   ```bash
   git push origin feature/YourFeature
   ```
5. **Open** a Pull Request.
Please ensure your code adheres to the existing code style and includes relevant tests

## Acknowledgements

Thank you for exploring **RoomBuddy**! 🚀  
I hope this platform assists you in finding the **perfect roommate**.  

If you have any **suggestions or feedback**, feel free to **reach out** or **open an issue** on **GitHub**. 😊
