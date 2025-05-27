# Student Management API - Spring Boot

This is a simple RESTful API built using Spring Boot for managing student records. It performs CRUD operations and stores data in a relational database (MySQL or H2). All endpoints have been tested using Postman.

## 🔧 Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL or H2 (You can switch based on configuration)
- Postman (for API testing)

---

## 📦 Model

### `Student`
| Field | Type   | Description           |
|-------|--------|-----------------------|
| id    | Long   | Auto-generated ID     |
| name  | String | Student name          |
| email | String | Student email address |
| course| String | Enrolled course       |

---

## 📁 Project Structure

``` 
src
└── main
├── java
│ └── com.example.sma
│ ├── controller
│ │ └── StudentController.java
│ ├── model
│ │ └── Student.java
│ ├── repository
│ │ └── StudentRepository.java
│ └── service
│ └── StudentService.java
└── resources
└── application.properties
```

---

## 📌 API Endpoints

| Method | Endpoint            | Description             |
|--------|---------------------|-------------------------|
| POST   | `/students`         | Add a new student       |
| GET    | `/students`         | Get all students        |
| GET    | `/students/{id}`    | Get a student by ID     |
| PUT    | `/students/{id}`    | Update a student by ID  |
| DELETE | `/students/{id}`    | Delete a student by ID  |

---