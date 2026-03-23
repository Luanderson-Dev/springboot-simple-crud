# Simple CRUD Employees API

A simple RESTful API for employee management, built with **Spring Boot** and **PostgreSQL**, documented with **Swagger (OpenAPI)**.

---

## 🚀 Tech Stack

| Technology | Description |
|---|---|
| Java 25 | Main language |
| Spring Boot (Web, Data JPA) | Application framework |
| PostgreSQL | Relational database |
| MapStruct | DTO to Entity mapping |
| Lombok | Boilerplate code reduction |
| SpringDoc OpenAPI | Swagger UI documentation |
| Docker & Docker Compose | Application and database containerization |

---

## 📋 Prerequisites

Make sure you have the following tools installed:

- [Git](https://git-scm.com/)
- [Docker](https://www.docker.com/) and [Docker Compose](https://docs.docker.com/compose/)

---

## 🛠️ Getting Started

**1. Clone the repository:**
```bash
git clone https://github.com/Luanderson-Dev/springboot-simple-crud.git
```

**2. Navigate to the project directory:**
```bash
cd springboot-simple-crud/
```

**3. Build the image and start the containers:**
```bash
docker-compose up -d --build
```

Once running:

- The **API** will be available at: `http://localhost:8080`
- **PostgreSQL** will be running on port `5432`
- Data will be persisted in a Docker volume

**To stop the containers:**
```bash
docker-compose down
```

---

## 📚 API Documentation (Swagger)

With the containers running, access the documentation at:

- **Swagger UI:** [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
- **OpenAPI JSON:** [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

---

## 🔗 Available Endpoints

The base route for the API is `/employees`.

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/employees/{id}` | Retrieves an employee's details |
| `POST` | `/employees` | Creates a new employee |
| `PUT` | `/employees/{id}` | Updates an employee's data |
| `DELETE` | `/employees/{id}` | Removes an employee from the database |

---

## 📦 Payload Structure (DTO)

Expected JSON format for creation (`POST`) and update (`PUT`) requests:
```json
{
  "name": "Employee Name",
  "email": "email@example.com",
  "salary": 50000
}
```