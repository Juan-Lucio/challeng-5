# challeng-5
# 🚀 Sprint 1 — Challenge Backlog  
**Project:** MELI Order Management System  
**Sprint Duration:** 2 Weeks  
**Objective:** Establish the backend foundation using Spring Boot 3.0 and Java 17, connect the PostgreSQL database, and implement CRUD functionality for managing orders efficiently.

---

## 🧠 User Stories (Sprint 1)

| # | User Story | Role | Description |
|---|-------------|------|--------------|
| **1** | As a *Developer*, I want to initialize the Spring Boot 3.0 project using Java 17 so that I can create a stable foundation for future modules. | Developer | The project must compile successfully, include dependencies, and contain a base controller template. |
| **2** | As a *DBA Engineer*, I want to configure the PostgreSQL connection so that the system can store and retrieve order data efficiently. | DBA Engineer | The app should connect to a PostgreSQL database with schema migration verified. |
| **3** | As a *Developer*, I want to design the `Order` entity and repository so that the data layer can persist and query order records. | Developer | Define entity relationships, data validation, and repository logic following Spring JPA conventions. |
| **4** | As a *Developer*, I want to implement the CRUD REST controller for orders so that the API can handle create, read, update, and delete requests. | Developer | Endpoints must be RESTful and tested through Postman. |
| **5** | As a *QA Engineer*, I want to test the endpoints with Postman so that I can confirm that all CRUD operations work as expected. | QA Engineer | All endpoints must return correct HTTP codes and payloads. |

---

## 🧾 Table 1 — Requirements List

| User Story | Requirements |
|-------------|---------------|
| **1. Initialize Spring Boot project** | Install Java 17; configure Maven dependencies; create `pom.xml`; define base package `com.meli.orders` and main class `MainApplication.java`. |
| **2. Configure PostgreSQL connection** | Define `application.yml` with DB credentials; create schema; configure `spring.datasource`; verify DB connectivity. |
| **3. Design Order entity and repository** | Create `Order` model (`id`, `customerName`, `totalAmount`, `status`); implement `OrderRepository` interface using JPA. |
| **4. Implement CRUD REST controller** | Create `OrderController`; implement methods: `POST /orders`, `GET /orders`, `PUT /orders/{id}`, `DELETE /orders/{id}`; use `@RestController` and `@RequestMapping`. |
| **5. Test CRUD endpoints with Postman** | Build Postman collection; validate HTTP responses (201, 200, 204, 404); ensure correct DB persistence. |

---

## 🧮 Table 2 — Prioritized List

| Requirement | Stage (Sprint) | Time Estimation | Deliverables |
|--------------|----------------|------------------|---------------|
| Initialize Spring Boot project | Sprint 1 | 2 days | Base Spring Boot 3.0 project with Java 17 and dependency setup in GitHub. |
| Configure PostgreSQL connection | Sprint 1 | 2 days | Working PostgreSQL connection with verified schema. |
| Design Order entity and repository | Sprint 1 | 1 day | `Order` entity and `OrderRepository` implemented with JPA annotations. |
| Implement CRUD REST controller | Sprint 1 | 3 days | Functional REST endpoints tested via Postman. |
| Test CRUD endpoints with Postman | Sprint 1 | 1 day | Postman collection uploaded under `/docs`. |

---

## 🧭 Sprint 1 Roadmap

| Milestone | Key Activities | Responsible Roles | Deliverables |
|------------|----------------|-------------------|---------------|
| **Sprint 1 – Backend Initialization & CRUD Setup** | - Initialize Spring Boot project.<br>- Connect to PostgreSQL.<br>- Create `Order` entity and repository.<br>- Develop CRUD REST API.<br>- Validate with Postman. | Developer, DBA Engineer, QA Engineer | ✅ Functional CRUD API with DB connection.<br>✅ Postman collection.<br>✅ Code pushed to GitHub. |

---

## 🧱 GitHub Integration Guide

### 🎯 Milestone
**Milestone name:** `Sprint 1 — Backend Initialization & CRUD Setup`  
**Description:**  
> Establish the project foundation by configuring Spring Boot 3.0 with Java 17, connecting PostgreSQL, and implementing CRUD functionality for order management.  
**Due date:** *2 weeks after Sprint start.*

---

### 🗂️ Issues (one per User Story)

| Issue Title | User Story (to add in description) | Role | Labels | Time Estimate | Deliverable |
|--------------|----------------------------------|-------|----------|----------------|--------------|
| Initialize Spring Boot Project | As a Developer, I want to initialize the Spring Boot 3.0 project using Java 17 so that I can create a stable foundation for future modules. | Developer | `enhancement`, `backend`, `sprint-1` | 1 days | Project initialized in GitHub. |
| Configure PostgreSQL Connection | As a DBA Engineer, I want to configure the PostgreSQL connection so that the system can store and retrieve order data efficiently. | DBA Engineer | `database`, `configuration`, `sprint-1` | 1 days | DB connected and verified. |
| Create Order Entity & Repository | As a Developer, I want to design the Order entity and repository so that the data layer can persist and query order records. | Developer | `entity`, `backend`, `sprint-1` | 1 day | Entity and repository implemented. |
| Implement Order CRUD Controller | As a Developer, I want to implement the CRUD REST controller for orders so that the API can handle create, read, update, and delete requests. | Developer | `api`, `controller`, `sprint-1` | 1 days | CRUD endpoints functional. |
| Test Endpoints with Postman | As a QA Engineer, I want to test the endpoints with Postman so that I can confirm that all CRUD operations work as expected. | QA Engineer | `testing`, `QA`, `sprint-1` | 1 day | Postman collection uploaded. |

---

### ⚙️ Custom Fields for GitHub Project Board

| Field | Type | Example Value | Purpose |
|--------|------|----------------|----------|
| **Sprint** | Dropdown | Sprint 1 | Links issue to sprint milestone. |
| **Role** | Text | Developer / DBA Engineer / QA Engineer | Assign responsibility. |
| **Priority** | Dropdown | High / Medium / Low | Defines order of work. |
| **Time Estimate** | Number | 2 days | Used for planning/burndown tracking. |
| **Status** | Dropdown | To Do / In Progress / Done | Tracks progress. |
| **Deliverable** | Text | “CRUD API implemented and tested” | Final result expected per issue. |

---

## 💡 Backlog Ideas for Future Sprints

- Add Docker configuration (`Dockerfile`, `docker-compose.yml`) for local deployment.  
- Implement environment-based configuration (`application-dev.yml`, `application-prod.yml`).  
- Integrate Swagger/OpenAPI documentation.  
- Add JUnit 5 tests for CRUD operations.  
- Set up CI/CD workflow using GitHub Actions.

---

## ✅ Expected Deliverables (Sprint 1)

| Deliverable | Description | Location |
|--------------|-------------|-----------|
| **Spring Boot Project** | Initialized backend with proper dependencies | `/meli-order-system/` |
| **Database Connection** | PostgreSQL integrated and verified | `/src/main/resources/application.yml` |
| **CRUD API** | REST endpoints for `/orders` tested successfully | `/src/main/java/com/meli/orders/controller/` |
| **Postman Collection** | Collection including CRUD operations | `/docs/MELI_Postman_Collection.json` |
| **GitHub Project Updated** | Milestone, issues, and board tracking configured | GitHub Repository |

---

🧩 **Tip for GitHub Setup**
- Add this file under `/docs/SPRINT1_BACKLOG.md`.  
- Create issues using the “New Issue” button, then link each one to the `Sprint 1` milestone.  
- In your Project Board, create custom fields as listed above and tag each issue with the responsible role and label.  
- Update the **Deliverables column** as work progresses.

---

**Author:** *Arturo Bandini (Developer — MELI Order System)*  
**Reviewed by:** *Juan Ventura (Tech Transformation Manager)*  
**Version:** 1.0  
**Date:** 2025-10-15
