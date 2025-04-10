# 🧪 Spring Boot Unit Testing API

## ✅ Overview
This project demonstrates how to write unit and integration tests for a Spring Boot application using:
- `@WebMvcTest` for controller layer testing  
- `@SpringBootTest` for service layer testing  
- `Mockito` for mocking service methods  

---

## ⚙️ Features
✔️ REST API for adding customers  
✔️ Simple welcome & greeting messages  
✔️ Unit tests for services and controllers  
✔️ MockMvc integration tests  

---

## 🏗️ Project Structure
```
src/
├── main/
│   ├── java/com/example/
│   │   ├── UnitTestingSample1Application.java
│   │   ├── dao/
│   │   │   └── Customer.java
│   │   ├── rest/
│   │   │   ├── CustomerRestController.java
│   │   │   └── MsgController.java
│   │   └── services/
│   │       ├── CustomerService.java
│   │       └── MsgServices.java
│   └── resources/
│       └── application.properties
├── test/
│   ├── java/com/example/
│   │   ├── UnitTestingSample1ApplicationTests.java
│   │   ├── restTest/
│   │   │   ├── CustomerRestControllerTest.java
│   │   │   └── MsgControllerTest.java
│   │   └── servicesTest/
│   │       ├── CustomerServiceTest.java
│   │       └── MsgServiceTest.java
```

---

## 🚀 API Endpoints
| Endpoint            | Method | Request Body        | Description                 |
|---------------------|--------|---------------------|-----------------------------|
| `/addCustomer`      | POST   | Customer JSON       | Adds a customer             |
| `/welcome`          | GET    | None                | Returns a welcome message   |
| `/greet`            | GET    | None                | Returns a greeting message  |

---

## 🧪 Unit Test Summary

| Test Class                        | Description                          |
|----------------------------------|--------------------------------------|
| `CustomerRestControllerTest`     | Tests POST `/addCustomer` endpoint   |
| `MsgControllerTest`              | Tests GET `/welcome` and `/greet`    |
| `CustomerServiceTest`            | Validates customer save logic        |
| `MsgServiceTest`                 | Checks message return from service   |

---

## 🛠️ Technologies Used
- **Java 17**  
- **Spring Boot 3.3.5**  
- **JUnit 5**  
- **Mockito**  
- **Spring Test (MockMvc)**  
- **Lombok**  

---

## ▶️ How to Run
```bash
# Run the Spring Boot app
mvn spring-boot:run

# Run all unit tests
mvn test
```

---

## 📄 License
MIT © 2025
