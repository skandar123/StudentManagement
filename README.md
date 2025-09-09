# Student Management System – Microservices

### 📌 Overview

This project demonstrates a Student Management System built with Spring Boot Microservices and Spring Cloud Netflix Eureka.
It manages students and their courses with services communicating through REST and registered in Eureka Service Discovery.

The architecture includes:

Eureka Server – service registry

API Gateway – entry point, routes requests to services

Student Service – provides student details, fetches courses via RestTemplate

Course Service – provides course details for a student

### 🏗️ Architecture

   ```+-------------------+
   |   API Gateway     |
   | (apigateway:8080) |
   +---------+---------+
   |
   -----------------------------------
   |                                 |
   +-------v-------+                 +-------v-------+
   | StudentService|                 | CourseService |
   | (student:8081)|                 | (course:8082) |
   +-------+-------+                 +-------+-------+
   |                                 |
   +---------------+-----------------+
   |
   +---------v---------+
   |   Eureka Server   |
   |   (discovery:8761)|
   +-------------------+
   ```

### 🚀 Features

Register services in Eureka Server

Retrieve student details with enrolled courses

Query courses by studentId

Load balancing with @LoadBalanced RestTemplate

Simple in-memory data storage (List-based services)

### 📂 Project Structure

com.apigateway         → API Gateway (Spring Cloud Gateway)
com.eserver            → Eureka Server
com.course             → Course Service
com.student            → Student Service

### ⚙️ Technologies Used

Java 17+

1. Spring Boot 3.x
2. Spring Cloud Netflix Eureka (Service Discovery)
3. Spring Cloud Gateway
4. RESTful APIs
5. Lombok (optional, for boilerplate reduction)

### ▶️ Running the Application
1. **Start Eureka Server**

       cd eserver
       mvn spring-boot:run


Runs on: http://localhost:8761

2. **Start Course Service**

       cd course-service
       mvn spring-boot:run


Registers with Eureka.

3. **Start Student Service**

       cd student-service
       mvn spring-boot:run


Registers with Eureka.

4. **Start API Gateway**

       cd api-gateway
       mvn spring-boot:run


Runs on: http://localhost:8080

### 🌐 API Endpoints

#### Student Service (via Gateway)

| Method | Endpoint              | Description                          |
| ------ | --------------------- | ------------------------------------ |
| GET    | `/student/{studentId}` | Get student details with courses     |

**Example Response:**

    {
    "studentId": 101,
    "name": "Deep Das",
    "phone": "9923568911",
    "courses": [
    {
    "cId": 1,
    "duration": "12 weeks",
    "courseName": "Databases",
    "studentId": 101
    },
    {
    "cId": 2,
    "duration": "4 weeks",
    "courseName": "Operating Systems",
    "studentId": 101
    }
    ]
    }

#### Course Service (via Gateway)

| Method | Endpoint                       | Description                     |
| ------ | ------------------------------ | ------------------------------- |
| GET    | `/course/student/{studentId}`  | Get all courses for a student   |

### 🧪 Testing

Each service can be tested independently by calling its REST APIs directly.

End-to-end flow can be tested by querying API Gateway for /student/{id} and checking if course data is merged properly.

### 📦 Requirements

1. Java 17+
2. Maven 3.8+
3. Spring Boot 3.x
4. Spring Cloud 2022.x

### 👩‍💻 Author

Sayantika Kandar
