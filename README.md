# 📌 Customizable Food Delivery Order System

A **Spring Boot + MyBatis + Redis + MySQL + Nginx + Alibaba Cloud OSS** based front-end and back-end separated food delivery order system, supporting both admin and user clients, with core features like product management, order management, shopping cart, and image upload.

**Core Focus:** This project emphasizes **back-end architecture design**, focusing on data caching strategies under high concurrency, RESTful API standards, and multi-module decoupling.

---

## 🚀 Project Overview

This project is a front-end and back-end separated customizable food delivery order system, including:

* 👨‍💼 Admin client (back-end)
* 👤 User client (Mini Program / Web)
* 🖥 Back-end service (RESTful API)
* ☁ Image storage (Alibaba Cloud OSS)
* ⚡ Cache optimization (Redis)

Project goals:

* Gain proficiency in enterprise-level Spring Boot development
* Understand transaction management and data consistency
* Master caching and performance optimization
* Acquire basic high-concurrency design thinking

---

## 🏗 Technical Architecture

### Back-end

* Spring Boot
* MyBatis
* MySQL
* Redis
* JWT
* Alibaba Cloud OSS
* WebSocket

### Front-end

* Vue (admin client)
* Mini Program / Web (user client)

### Others

* Nginx reverse proxy
* Maven build
* Git version control

---

## 📂 Project Structure

```text
Sky-Take-Out
├── sky-take-out                # Back-end core project (Maven multi-module)
│   ├── sky-common              # Common module: utilities, constants, exceptions, etc.
│   ├── sky-pojo                # Entity module: POJOs, DTOs, VOs, etc.
│   └── sky-server              # Business service module: Controllers, Services, Mappers, and main application class
├── Front-end                   # Admin front-end code (Vue/React)
│   └── nginx-1.20.2            # Contains static front-end resources and Nginx configuration
├── mp-weixin                   # WeChat Mini Program code (user client)
├── prototype                   # Product prototype (Axure or PDF files)
├── README.md                   # Project overview document
├── Mac_Deployment_Guide.md     # Full deployment guide for macOS with Nginx/MySQL/Redis
└── .gitignore                  # Git ignore configuration (.DS_Store, target, etc.)
```

---

## Module Description

### Back-end Modules

| Module Name  | Description                                                                             |
| ------------ | --------------------------------------------------------------------------------------- |
| `sky-server` | Core back-end service, handling requests, business logic, APIs, and database operations |
| `sky-common` | Common utilities, constants, and exception handling                                     |
| `sky-pojo`   | Entity module, corresponding to database table structures                               |

### Front-end Modules

| Module Name  | Description                                                           |
| ------------ | --------------------------------------------------------------------- |
| `Front-end`  | Web front-end display, HTML/CSS/JS static pages + Nginx configuration |
| `mp-weixin`  | WeChat Mini Program client, providing mobile ordering and management  |
| `prototype`  | Product prototype files, design and interaction specification         |
| `README.md`  | Project description document                                          |
| `Mac_Deployment_Guide.md` | Full macOS deployment guide for front-end, back-end, and Nginx        |

---

## ⚙ Core Features

### 🛠 Admin Client Features

* Employee management
* Category management
* Dish management
* Set meal management
* Order management
* Data statistics

### 👤 User Client Features

* Browse products
* Add to shopping cart
* Place orders
* Order payment (simulated)
* Order status flow

---

## 🔥 Technical Highlights

### 1️⃣ Redis Cache Optimization

* Cache dish data
* Reduce database pressure
* Improve API response speed

---

### 2️⃣ Transaction Management

* Use transactions during order placement
* Ensure order data consistency
* Prevent partial commits

---

### 3️⃣ Image Upload (Alibaba Cloud OSS)

* Use OSS for image storage
* Back-end returns access URLs
* Separate file server from business server

---

### 4️⃣ Nginx Reverse Proxy

* Unified entry point
* Solve cross-origin issues
* Improve static resource access performance

---

### 5️⃣ Engineering Design

* Modular development
* Unified response format
* Global exception handling
* Standardized logging

---

### 5️⃣ JWT Integration

* Solve stateless HTTP limitations
* Enable users to stay logged in for a period without repeated authentication
* Handle signature processing
* Enhance security for critical information

---

## 🗄 Database Design

Main tables:

* employee
* category
* dish
* setmeal
* order
* order_detail
* shopping_cart

---

## 🧪 Environment Requirements

* JDK 8+
* Maven 3.6+
* MySQL 8.0+
* Redis 6+
* Nginx 1.20+
* Node.js 16+

---

## 🍔 Full Mac Deployment Guide

> Suitable for macOS (Apple Silicon / Intel)
> Stack: Spring Boot + MySQL + Redis + Nginx

Please refer to: `Mac_Deployment_Guide.md`

---

## 📈 Future Optimization

* Introduce distributed locks to prevent overselling
* Optimize for flash sale scenarios
* Add API rate limiting
* Use message queues to smooth traffic
* Implement database sharding
* Docker deployment

---

## 👨‍💻 Author

Personal practice project to improve Java back-end skills and high-concurrency design thinking.

---

