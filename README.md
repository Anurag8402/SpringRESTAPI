# 🏢 Office Management System – Spring Boot REST API

## 📌 Project Overview

The **Office Management System** is a Spring Boot–based RESTful web application that provides APIs to manage office details stored in a MySQL database. The project demonstrates backend development concepts such as REST API design, CRUD operations, Spring Data JPA, and database integration.

This project is developed as part of learning **Spring Boot REST APIs** and is suitable for **fresher / entry-level Java developer** profiles.

---

## 🚀 Features

* Create and manage office records
* Fetch all office details
* Update office information using REST API
* Delete office records
* Count offices based on country
* Integration with MySQL database
* APIs tested using Postman

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **Spring Data JPA (Hibernate)**
* **MySQL**
* **REST API**
* **Maven**
* **Postman**
* **Git & GitHub**

---

## 🗄️ Database Design

### Schema Name

```
classicmodels
```

### Table Name

```
offices
```

### Table Structure

| Column Name  | Data Type    | Description                               |
| ------------ | ------------ | ----------------------------------------- |
| officecode   | INT (PK, AI) | Office Code (Primary Key, Auto Increment) |
| city         | VARCHAR(255) | City name                                 |
| phone        | VARCHAR(255) | Contact number                            |
| addressline1 | VARCHAR(255) | Address line 1                            |
| addressline2 | VARCHAR(255) | Address line 2                            |
| state        | VARCHAR(255) | State                                     |
| country      | VARCHAR(255) | Country                                   |
| postalcode   | VARCHAR(255) | Postal code                               |
| territory    | VARCHAR(255) | Territory                                 |

---

## 📡 REST API Endpoints

### 🔹 Get All Offices

```
GET /office/getAll
```

**Sample Response:**

```json
[
  {
    "officecode": 2,
    "city": "Boston",
    "phone": "9921102010",
    "addressline1": "1550 Court Place",
    "addressline2": "Suite 102",
    "state": "MA",
    "country": "USA",
    "postalcode": "02107",
    "territory": "NA"
  }
]
```

---

### 🔹 Update Office Details

```
PUT /office/update/{phone}/{officecode}
```

**Request Body:**

```json
{
  "city": "Pune",
  "phone": "+44 20 7877 8393",
  "addressline1": "25 New Broad Street",
  "addressline2": "Level 8",
  "state": null,
  "country": "UAE",
  "postalcode": "EN-1HN",
  "territory": "EME"
}
```

---

### 🔹 Count Offices by Country

```
GET /office/getcount/{country}
```

**Example:**

```
GET /office/getcount/USA
```

**Response:**

```json
2
```

---

### 🔹 Delete Office Record

```
DELETE /office/delete/{officecode}
```

**Example:**

```
DELETE /office/delete/5
```

---

## ▶️ How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/<your-username>/<repository-name>.git
```

2. Open the project in **Spring Tool Suite / IntelliJ / Eclipse**

3. Configure MySQL in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/classicmodels
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

4. Run the application:

```bash
mvn spring-boot:run
```

5. Test APIs using **Postman**.

---

## 🧪 API Testing

* All endpoints tested using **Postman**
* Screenshots included for:

  * Get All Offices
  * Update Office
  * Delete Office
  * Count Offices by Country

---

## 👨‍💻 Author

**Anurag Yadav**
MCA | Java & Spring Boot Developer
GitHub: [https://github.com/Anurag8402](https://github.com/Anurag8402)

---

## ⭐ Recruiter Note

This project demonstrates:

* Spring Boot REST API fundamentals
* Proper layered architecture (Controller, Service, Repository)
* MySQL database integration using JPA
* Real-world CRUD and update operations

✔ Suitable for fresher-level backend roles
