# MELI Order Management System API - Digital NAO Challenge Showcase

![Java](https://img.shields.io/badge/Java-17-blue.svg) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-12%2B-blue.svg) ![Maven](https://img.shields.io/badge/Maven-3.6%2B-orange.svg) ![Swagger](https://img.shields.io/badge/Swagger-OpenAPI%203-green.svg) ![JUnit5](https://img.shields.io/badge/Testing-JUnit%205-blueviolet.svg)

**Developed by:** [Your Name/Arturo Bandini] - *Programming Technician & Chemical Engineer*

---

## 📜 Table of Contents

1.  [**Executive Summary**](#1-executive-summary)
2.  [**The Challenge: MELI's Order System Crisis**](#2-the-challenge-melis-order-system-crisis)
3.  [**The Solution: A Robust Spring Boot API**](#3-the-solution-a-robust-spring-boot-api)
    * [Core Features](#core-features)
    * [Technology Stack](#technology-stack)
4.  [**Project Journey: From Theory to Implementation (Sprints 1-3)**](#4-project-journey-from-theory-to-implementation-sprints-1-3)
    * [**Sprint 1: Laying the Foundation (CRUD & Database)**](#sprint-1-laying-the-foundation-crud--database)
    * [**Sprint 2: Building for Reality (Environments & Security)**](#sprint-2-building-for-reality-environments--security)
    * [**Sprint 3: Ensuring Quality & Professionalism (Docs & Testing)**](#sprint-3-ensuring-quality--professionalism-docs--testing)
5.  [**Demonstration: How the API Works**](#5-demonstration-how-the-api-works)
    * [API Documentation (Swagger UI)](#api-documentation-swagger-ui)
    * [Creating an Order (Postman/Swagger)](#creating-an-order-postmanswagger)
    * [Retrieving Orders (Postman/Swagger)](#retrieving-orders-postmanswagger)
6.  [**Setup and Usage Guide**](#6-setup-and-usage-guide)
    * [Prerequisites](#prerequisites)
    * [Installation](#installation)
    * [Database Configuration](#database-configuration)
    * [Running the Application (Profiles Explained)](#running-the-application-profiles-explained)
7.  [**Beyond the Challenge: Scalability & Future Improvements**](#7-beyond-the-challenge-scalability--future-improvements)
8.  [**Project Cost Estimation & Value Proposition**](#8-project-cost-estimation--value-proposition)
    * [Executive Summary: Investing in Stability and Growth](#executive-summary-investing-in-stability-and-growth)
    * [Project Scope & Deliverables Recap](#project-scope--deliverables-recap)
    * [Cost Estimation Breakdown](#cost-estimation-breakdown)
    * [Value Proposition & ROI for MELI](#value-proposition--roi-for-meli)

---

## 1. Executive Summary

This project documents the successful development of a robust, production-ready Order Management System API for MELI, addressing critical technical failures in their existing system. Developed over three intensive sprints, this solution leverages the power of **Spring Boot**, **Java 17**, and **PostgreSQL** to provide a scalable, secure, and maintainable backend service. Key achievements include implementing full CRUD functionality, establishing dynamic environment configurations using Spring Profiles, integrating automated testing (Unit & Integration), and providing comprehensive API documentation via Swagger/OpenAPI. This project not only delivers a technical solution but also demonstrates a strong grasp of modern software development principles and practices, showcasing the ability to translate theoretical knowledge into practical, high-quality code, even coming from a non-traditional programming background (Chemical Engineering).

---

## 2. The Challenge: MELI's Order System Crisis

MELI, a leading e-commerce company, faced significant operational disruptions due to failures in its order management system. Incorrect production configurations and database node failures led to substantial financial losses and customer dissatisfaction. The urgent need was for a revamped, reliable system built on modern, stable technologies. This challenge simulated that real-world crisis, requiring the development of a solution from the ground up using Spring and Spring Boot.

---

## 3. The Solution: A Robust Spring Boot API

The core of the solution is a RESTful API built with Spring Boot, providing a backend service to manage customer orders efficiently and reliably.

### Core Features

* **Complete Order Management:** Full CRUD (Create, Read, Update, Delete) operations for orders.
* **Relational Data Model:** A well-structured PostgreSQL schema modeling Customers, Products, and Orders with their relationships.
* **Environment-Specific Configurations:** Utilizes Spring Profiles (`dev`, `dev-pg`, `test`, `prod`) for seamless operation across different environments (H2 in-memory for development/testing, PostgreSQL for production).
* **Secure Credential Management:** Production database credentials managed via environment variables, enhancing security.
* **Interactive API Documentation:** Automatically generated and interactive documentation using Swagger/OpenAPI.
* **Automated Testing:** Comprehensive unit and integration tests ensure code quality and reliability.

### Technology Stack

* **Language:** Java 17
* **Framework:** Spring Boot 3.x (including Spring Web, Spring Data JPA)
* **Database:** PostgreSQL (Production/Persistent Dev), H2 (In-Memory Dev/Testing)
* **Build Tool:** Apache Maven
* **Documentation:** Swagger/OpenAPI (via `springdoc-openapi`)
* **Testing:** JUnit 5, Mockito, Spring Boot Test
* **Utilities:** Lombok

---

## 4. Project Journey: From Theory to Implementation (Sprints 1-3)

This section details the evolution of the project across the three sprints, highlighting the theoretical concepts learned and applied at each stage.

### **Sprint 1: Laying the Foundation (CRUD & Database)**

* **Objective:** Create the basic web project, implement core CRUD functionality for orders, and establish database connectivity.
* **Theoretical Concepts Applied:**
    * **Spring Boot Fundamentals:** Understanding auto-configuration, starter dependencies (`web`, `data-jpa`), and the application lifecycle.
    * **REST Principles:** Designing resource-based endpoints (URIs), using appropriate HTTP methods (GET, POST, PUT, DELETE), and standard status codes (200, 201, 404, 500).
    * **Dependency Injection (DI):** Using `@Autowired` to manage component dependencies (e.g., injecting Repository into Service, Service into Controller).
    * **Spring Data JPA:** Understanding Entities (`@Entity`), Repositories (`JpaRepository`), basic ORM concepts, and database interaction abstraction.
    * **Layered Architecture:** Structuring the code into distinct layers (Controller, Service, Repository, Entity) for maintainability and separation of concerns.
* **Implementation Highlights:**
    * Initialized the project using Spring Initializr.
    * Defined the `Order`, `Customer`, and `Product` entities.
    * Implemented `OrderRepository`, `OrderService`, and `OrderController` for CRUD operations.
    * Initially configured and connected to an H2 in-memory database, then migrated to a persistent PostgreSQL database using a detailed schema (`meli_database_schema_v2.sql`).
    * Created a Postman collection (`MELI_Order_API.postman_collection.json`) for manual API testing.
    * Established version control with Git and GitHub.
* **Key Outcomes:** A functional API capable of managing orders, connected to a persistent database, demonstrating core Spring Boot and REST concepts.
    
    <img width="1060" height="938" alt="image" src="https://github.com/user-attachments/assets/77593484-7744-4e68-9fbb-7270da051dbd" />
    <img width="1281" height="809" alt="image" src="https://github.com/user-attachments/assets/fea041b4-d3c6-4db6-9c5f-8a0a614c1e8c" />
    <img width="1319" height="922" alt="image" src="https://github.com/user-attachments/assets/5dd7a3ba-e82a-4a28-911a-37f2b546931a" />
    <img width="1331" height="903" alt="image" src="https://github.com/user-attachments/assets/9aaea1b2-c6da-4181-b1e4-1633e1da83f3" />


### **Sprint 2: Building for Reality (Environments & Security)**

* **Objective:** Introduce configuration management for different deployment environments and implement basic security considerations.
* **Theoretical Concepts Applied:**
    * **Spring Profiles:** Understanding how to create environment-specific configurations (`application-{profile}.yml`) and activate them (`spring.profiles.active`). This allows the same code to behave differently based on the environment.
    * **Externalized Configuration:** Moving environment-specific details (like database URLs) out of the main codebase and into configuration files.
    * **YAML Configuration:** Using the YAML format for more structured and readable configuration files compared to `.properties`.
    * **Environment Variables:** Learning how to inject sensitive information (like production passwords) using system environment variables (`${DB_PASSWORD}`) instead of hardcoding them, a crucial security practice.
    * **Database Connection Pooling (HikariCP):** Understanding the default connection pool provided by Spring Boot for efficient database connection management.
* **Implementation Highlights:**
    * Refactored configuration from a single `application.properties` to multiple YAML files: `application.yml` (common/default), `application-dev.yml` (H2), `application-test.yml` (H2 for tests), `application-prod.yml` (PostgreSQL using env var), and `application-dev-pg.yml` (PostgreSQL with password in file for convenience).
    * Defined distinct database connection details and JPA/Hibernate behaviors (`ddl-auto`) for each profile.
    * Implemented the use of the `DB_PASSWORD` environment variable for the production profile.
    * Updated the `README.md` with detailed instructions on how to activate profiles and set environment variables.
    * Created startup scripts (`start-dev.bat`/`.sh`, `start-prod.bat`/`.sh`) for easier execution.
    * Introduced VS Code Launch Configurations (`.vscode/launch.json`) for seamless profile switching directly from the IDE.
* **Key Outcomes:** An application ready for deployment in different environments, with secure handling of production credentials and improved developer experience through easy profile switching.

    <img width="1919" height="959" alt="image" src="https://github.com/user-attachments/assets/33046946-e9b6-4904-8f80-bf97ec7d25f8" />
<img width="1919" height="888" alt="image" src="https://github.com/user-attachments/assets/32381768-9dc6-4327-ad09-3b4663efb5c9" />
<img width="1915" height="945" alt="image" src="https://github.com/user-attachments/assets/b9230366-4f25-40a9-8270-217f58114756" />
<img width="1919" height="938" alt="image" src="https://github.com/user-attachments/assets/175ffc05-7701-4a52-a67c-bd50d46803a8" />
<img width="1919" height="852" alt="image" src="https://github.com/user-attachments/assets/3ec11825-7ab4-40eb-aea6-8fb6ac83abee" />


### **Sprint 3: Ensuring Quality & Professionalism (Docs & Testing)**

* **Objective:** Implement comprehensive API documentation and build a robust suite of automated tests.
* **Theoretical Concepts Applied:**
    * **OpenAPI Specification (Swagger):** Understanding the standard for describing REST APIs and using tools (`springdoc-openapi`) to automatically generate documentation from code.
    * **API Documentation Best Practices:** Using annotations (`@Operation`, `@ApiResponse`, etc.) to provide clear, detailed descriptions for endpoints, parameters, and responses.
    * **Unit Testing:** Principles of testing individual components in isolation. Using **JUnit 5** for the testing framework and **Mockito** for creating mock objects (e.g., mocking the `OrderRepository` when testing `OrderServiceImpl`) to isolate the unit under test. Concepts like Arrange-Act-Assert (Given-When-Then).
    * **Integration Testing:** Principles of testing the interaction between multiple components (Controller, Service, Repository, Database). Using **Spring Boot Test** (`@SpringBootTest`) to load the application context, **MockMvc** to simulate HTTP requests, and **`@ActiveProfiles("test")`** to ensure tests run against a dedicated test database (H2).
    * **Test Driven Development (TDD) concepts (applied loosely):** Writing tests to define expected behavior before or alongside implementation.
* **Implementation Highlights:**
    * Added the `springdoc-openapi-starter-webmvc-ui` dependency.
    * Created `OpenApiConfig.java` to customize Swagger UI metadata.
    * Heavily annotated `OrderController.java` with Swagger annotations for detailed documentation.
    * Developed `OrderServiceImplTest.java` with JUnit 5 and Mockito, covering various scenarios for the service layer methods.
    * Developed `OrderControllerIntegrationTest.java` using `@SpringBootTest` and `MockMvc` to test the full request lifecycle for key API endpoints against an H2 test database.
    * Ensured all tests pass using `.\mvnw.cmd test`.
* **Key Outcomes:** A professionally documented API accessible via `/swagger-ui.html` and a reliable application backed by automated unit and integration tests, ensuring future changes won't break existing functionality.
    
    <img width="1316" height="976" alt="image" src="https://github.com/user-attachments/assets/932fca8f-a241-45ca-9398-637a375dc627" />
<img width="921" height="479" alt="image" src="https://github.com/user-attachments/assets/5e8ab392-e6d7-4381-8917-70e3d27688b3" />


---

## 5. Demonstration: How the API Works

*(This section is where you would typically insert screenshots showing the application in action)*

### API Documentation (Swagger UI)

The primary way to explore the API is through the Swagger UI, available when the application is running.

**Access URL:** `http://localhost:8080/swagger-ui.html`

<img width="1364" height="860" alt="image" src="https://github.com/user-attachments/assets/5038648b-5e7d-4e4b-8cfc-bc997ea94c13" />


This interface allows you to:
* See all available endpoints (`/api/v1/orders` and its sub-paths).
* Expand each endpoint to view details: HTTP method, description, parameters (path, query, body), and possible responses with schemas.
* **Try out** the API directly from the browser without needing Postman.

### Creating an Order (Postman/Swagger)

To create a new order, send a `POST` request to `/api/v1/orders` with a JSON body specifying the customer ID and order details.

**Example Request Body:**
json
{
    "customer": {
        "id": 1 // Use an existing customer ID from your database
    },
    "status": "PENDIENTE",
    "shippingAddress": "Av. Siempre Viva 742, Springfield",
    "total": 1299.50
}
<img width="1054" height="903" alt="image" src="https://github.com/user-attachments/assets/ace13248-5a9b-4b53-99a3-ddb7485b84d3" />

Retrieving Orders (Postman/Swagger)
You can retrieve all orders or a specific order by ID.

Get All Orders: Send a GET request to /api/v1/orders.

Get Order by ID: Send a GET request to /api/v1/orders/{id} (replace {id} with the actual ID).

<img width="1024" height="985" alt="image" src="https://github.com/user-attachments/assets/2fdb6082-47aa-45ea-94cb-ba7702120d37" />


---

## 6. Setup and Usage Guide
Prerequisites
Java 17+

Maven 3.6+

PostgreSQL 12+

Git

Installation
Bash

git clone [https://github.com/Juan-Lucio/challeng-5.git](https://github.com/Juan-Lucio/challeng-5.git)
cd order-management
Database Configuration
Ensure PostgreSQL is running.

Create the database: CREATE DATABASE meli_db;

Run the schema script (meli_database_schema_v2.sql) against meli_db.

Configure passwords:

Edit src/main/resources/application-dev-pg.yml for the dev-pg profile.

Set the DB_PASSWORD environment variable for the prod profile.

Running the Application (Profiles Explained)
You can run and switch profiles in two main ways.

Method A: Command Line (Terminal)
Run dev Profile (Default)
PowerShell

.\mvnw.cmd spring-boot:run
H2 Console: http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:orderdb_dev)

Run dev-pg Profile (PostgreSQL Easy Mode)
PowerShell

.\mvnw.cmd spring-boot:run "-Dspring-boot.run.profiles=dev-pg"
Run prod Profile (PostgreSQL Secure Mode)
1. Set Environment Variable:

PowerShell

$env:DB_PASSWORD = "YourActualPostgresPassword"
2. Run Application:

PowerShell

.\mvnw.cmd spring-boot:run "-Dspring-boot.run.profiles=prod"
Method B: VS Code Launch Configurations (Recommended)
The easiest way.

Go to the "Run and Debug" view (Ctrl+Shift+D).

Select the desired profile from the dropdown.

Press F5 or the green "Play" button.

---

## 7. Beyond the Challenge: Scalability & Future Improvements
This project lays a solid foundation. Potential future enhancements include:

Detailed Product Management: Implementing full CRUD for Products.

Order Item Management: Allowing API interaction with individual items within an order.

Authentication & Authorization: Securing the API using Spring Security.

Asynchronous Processing: Using message queues (like RabbitMQ or Kafka) for potentially long-running tasks like sending confirmation emails.

Containerization: Packaging the application using Docker for easier deployment.

More Comprehensive Testing: Adding more edge cases and potentially performance tests.

This project demonstrates not just the ability to follow instructions but also to understand underlying principles (REST, DI, ORM, Profiles, Testing) and apply them to build a robust, real-world application. The transition from a Chemical Engineering background highlights adaptability and a strong capacity for learning complex technical skills.
---


##8. Project Cost Estimation & Value Proposition
(This section provides a summary analysis relevant to the project's context and value.)

Executive Summary: Investing in Stability and Growth
MELI recently faced significant operational challenges stemming from failures within its core order management system, impacting revenue and customer trust. The project undertaken addresses these critical issues by delivering a modern, robust, and scalable API backend built on industry-standard technologies (Spring Boot, Java 17, PostgreSQL). This analysis provides a transparent estimation of the development costs, framed against the substantial Return on Investment (ROI) achieved through enhanced system stability, improved customer experience, and future-proofing the platform. The project leveraged a highly motivated resource with a strong analytical background (Chemical Engineering) transitioning into software development, demonstrating rapid skill acquisition and delivering exceptional value.

---
**Author:** *Arturo Bandini (Developer — MELI Order System)*  
**Reviewed by:** *Juan Ventura (Tech Transformation Manager)*  
**Version:** 1.0  
**Date:** 2025-10-15
