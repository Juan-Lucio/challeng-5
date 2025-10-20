# challeng-5
# MELI - Order Management System API

## Overview

This project is a RESTful API for managing customer orders, developed as a solution to the technical challenges presented in the Digital NAO challenge. It is built using **Spring Boot 3**, **Java 17**, and connects to a **PostgreSQL** database.

The API provides full CRUD (Create, Read, Update, Delete) functionality for orders, following best practices for REST API design and project structure.

## Features

-   **CRUD Operations:** Full support for creating, reading, updating, and deleting orders.
-   **Relational Data Model:** Uses a PostgreSQL database with a structured schema to manage customers, products, and orders.
-   **RESTful Endpoints:** Clean and intuitive API endpoints under the `/api/v1/orders` path.
-   **Exception Handling:** Proper handling for cases where resources are not found (404 errors).

---

---

## Getting Started

Follow these instructions to get the project up and running on your local machine.

### 1. Clone the Repository

First, clone this repository to your local machine using the following command:

bash
git clone [https://github.com/Juan-Lucio/challeng-5.git](https://github.com/Juan-Lucio/challeng-5.git)
cd order-management

---
# Sistema de Gestión de Órdenes - MELI Challenge

![Java](https://img.shields.io/badge/Java-17-blue.svg) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-12%2B-blue.svg) ![Maven](https://img.shields.io/badge/Maven-3.6%2B-orange.svg)

API RESTful para la gestión de órdenes, desarrollada como solución a los desafíos técnicos planteados en el proyecto Digital NAO. La aplicación utiliza Spring Boot y está diseñada para ser robusta, segura y fácilmente desplegable en diferentes entornos.

---

## 📋 Tabla de Contenidos

1.  [**Visión General**](#1-visión-general-del-proyecto)
2.  [**Pila Tecnológica**](#2-pila-tecnológica)
3.  [**Prerrequisitos**](#3-prerrequisitos)
4.  [**Instalación y Configuración**](#4-instalación-y-configuración-inicial)
5.  [**Perfiles de Entorno**](#5-gestión-de-entornos-con-perfiles)
6.  [**Cómo Ejecutar la Aplicación**](#6-cómo-ejecutar-la-aplicación)
7.  [**Pruebas de la API**](#7-pruebas-de-la-api-con-postman)

---

## 1. Visión General del Proyecto

Este proyecto implementa una API REST para administrar órdenes de clientes, siguiendo las mejores prácticas de diseño de software y gestión de configuración.

### **Funcionalidades Principales**

* **Operaciones CRUD completas** para la gestión de órdenes.
* **Modelo de datos relacional** en PostgreSQL para persistir clientes, productos y órdenes.
* **Endpoints RESTful** limpios e intuitivos bajo la ruta `/api/v1/orders`.
* **Gestión de perfiles** para separar los entornos de `desarrollo`, `pruebas` y `producción`.
* **Configuración segura** de credenciales de producción mediante variables de entorno.

---

## 2. Pila Tecnológica

* **Lenguaje:** Java 17
* **Framework:** Spring Boot 3
* **Persistencia:** Spring Data JPA (Hibernate)
* **Bases de Datos:**
    * PostgreSQL (Producción / Desarrollo Persistente)
    * H2 (Desarrollo en Memoria / Pruebas)
* **Gestión de Dependencias:** Apache Maven
* **Herramientas:** Lombok

---

## 3. Prerrequisitos

Asegúrate de tener instalado el siguiente software en tu sistema:

* ✅ **JDK 17** (o una versión LTS posterior)
* ✅ **Apache Maven** (v3.6 o posterior)
* ✅ **PostgreSQL** (v12 o posterior)
* ✅ **Git**

---

## 4. Instalación y Configuración Inicial

Sigue estos pasos para poner en marcha el proyecto en tu máquina local.

### **Paso 4.1: Clonar el Repositorio**

bash
git clone [https://github.com/Juan-Lucio/challeng-5.git](https://github.com/Juan-Lucio/challeng-5.git)
cd order-management


### **Paso 4.2: Configuración de la Base de Datos PostgreSQL**

1.  **Crear la Base de Datos:** Conéctate a tu servidor de PostgreSQL y crea la base de datos.
    sql
    CREATE DATABASE meli_db;
    
2.  **Poblar las Tablas:** Ejecuta el script `meli_database_schema_v2.sql` (disponible en la documentación del proyecto) dentro de `meli_db` para crear el esquema y cargar los datos de ejemplo.

### **Paso 4.3: Configurar la Contraseña (¡Paso Crucial\!)**

La aplicación necesita saber la contraseña de tu base de datos para los perfiles que la usan.

  * Para el perfil `dev-pg`, edita el archivo `src/main/resources/application-dev-pg.yml` y actualiza el campo `password`.
  * Para el perfil `prod`, la contraseña se configura mediante una variable de entorno (ver sección 6).

-----

## 5\. Gestión de Entornos con Perfiles

Este proyecto utiliza **Perfiles de Spring** para una gestión de configuración limpia y segura.

| Perfil   | Base de Datos       | Caso de Uso                                                                                              |
| :------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| `dev`    | **H2 (En Memoria)** | **(Por defecto)** Ideal para el desarrollo diario. Rápido y no requiere configuración externa.           |
| `dev-pg` | **PostgreSQL** | Para desarrollar contra una base de datos persistente, con la comodidad de tener la configuración en el archivo. |
| `test`   | **H2 (En Memoria)** | Se activa automáticamente durante las pruebas para garantizar un entorno aislado.                          |
| `prod`   | **PostgreSQL** | Simula un despliegue real, leyendo credenciales sensibles desde variables de entorno para máxima seguridad. |

-----

## 6\. Cómo Ejecutar la Aplicación

Puedes ejecutar y cambiar de perfil de dos maneras.

### **Método A: Línea de Comandos (Terminal)**

#### **Ejecutar Perfil `dev` (Por Defecto)**

powershell
.\mvnw.cmd spring-boot:run


  * **Consola H2:** `http://localhost:8080/h2-console` (URL JDBC: `jdbc:h2:mem:orderdb_dev`)

#### **Ejecutar Perfil `dev-pg` (PostgreSQL Fácil)**

powershell
.\mvnw.cmd spring-boot:run "-Dspring-boot.run.profiles=dev-pg"


#### **Ejecutar Perfil `prod` (PostgreSQL Seguro)**

**1. Establecer Variable de Entorno:**

powershell
$env:DB_PASSWORD = "TuContraseñaDePostgres"


**2. Ejecutar la Aplicación:**

powershell
.\mvnw.cmd spring-boot:run "-Dspring-boot.run.profiles=prod"


### **Método B: VS Code Launch Configurations (Recomendado)**

La forma más sencilla.

1.  Ve a la vista **"Run and Debug"** (Ctrl+Shift+D).
2.  En el menú desplegable, elige el perfil que deseas lanzar.
3.  Presiona `F5` o el botón verde de "Play".

-----

## 7\. Pruebas de la API con Postman

Se recomienda importar la colección `MELI_Order_API.postman_collection.json` en Postman para tener un conjunto completo de peticiones listas para probar todas las operaciones CRUD de la API.


---

**Author:** *Arturo Bandini (Developer — MELI Order System)*  
**Reviewed by:** *Juan Ventura (Tech Transformation Manager)*  
**Version:** 1.0  
**Date:** 2025-10-15
