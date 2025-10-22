# Sistema de Gestión de Órdenes - MELI Challenge

![Java](https://img.shields.io/badge/Java-17-blue.svg) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-12%2B-blue.svg) ![Maven](https://img.shields.io/badge/Maven-3.6%2B-orange.svg) ![Swagger](https://img.shields.io/badge/Swagger-OpenAPI%203-green.svg) ![JUnit5](https://img.shields.io/badge/Testing-JUnit%205-blueviolet.svg)

**Desarrollado por:** [Tu Nombre/Arturo Bandini] - *Técnico en Programación e Ingeniero Químico*

---

## 📜 Tabla de Contenidos

1.  [**Resumen Ejecutivo**](#1-resumen-ejecutivo)
2.  [**El Desafío: Crisis del Sistema de Órdenes de MELI**](#2-el-desafío-crisis-del-sistema-de-órdenes-de-meli)
3.  [**La Solución: Una API Robusta con Spring Boot**](#3-la-solución-una-api-robusta-con-spring-boot)
    * [Características Principales](#características-principales)
    * [Pila Tecnológica](#pila-tecnológica)
4.  [**Viaje del Proyecto: De la Teoría a la Implementación (Sprints 1-3)**](#4-viaje-del-proyecto-de-la-teoría-a-la-implementación-sprints-1-3)
    * [**Sprint 1: Sentando las Bases (CRUD y Base de Datos)**](#sprint-1-sentando-las-bases-crud-y-base-de-datos)
        * *Conceptos Teóricos Aplicados*
        * *Hitos de Implementación*
        * *Resultados Clave*
    * [**Sprint 2: Construyendo para la Realidad (Entornos y Seguridad)**](#sprint-2-construyendo-para-la-realidad-entornos-y-seguridad)
        * *Conceptos Teóricos Aplicados*
        * *Hitos de Implementación*
        * *Resultados Clave*
    * [**Sprint 3: Asegurando Calidad y Profesionalismo (Docs y Pruebas)**](#sprint-3-asegurando-calidad-y-profesionalismo-docs-y-pruebas)
        * *Conceptos Teóricos Aplicados*
        * *Hitos de Implementación*
        * *Resultados Clave*
5.  [**Demostración: Cómo Funciona la API**](#5-demostración-cómo-funciona-la-api)
    * [Documentación de la API (Swagger UI)](#documentación-de-la-api-swagger-ui)
    * [Creando una Orden (Postman/Swagger)](#creando-una-orden-postmanswagger)
    * [Consultando Órdenes (Postman/Swagger)](#consultando-órdenes-postmanswagger)
6.  [**Guía de Configuración y Uso**](#6-guía-de-configuración-y-uso)
    * [Prerrequisitos](#prerrequisitos)
    * [Instalación](#instalación)
    * [Configuración de la Base de Datos](#configuración-de-la-base-de-datos)
    * [Ejecutando la Aplicación (Perfiles Explicados)](#ejecutando-la-aplicación-perfiles-explicados)
7.  [**Más Allá del Desafío: Escalabilidad y Mejoras Futuras**](#7-más-allá-del-desafío-escalabilidad-y-mejoras-futuras)

---

## 1. Resumen Ejecutivo

Este proyecto documenta el desarrollo exitoso de una API robusta y lista para producción para el Sistema de Gestión de Órdenes de MELI, abordando fallos técnicos críticos en su sistema existente. Desarrollada a lo largo de tres sprints intensivos, esta solución aprovecha el poder de **Spring Boot**, **Java 17** y **PostgreSQL** para proporcionar un servicio backend escalable, seguro y mantenible. Los logros clave incluyen la implementación de la funcionalidad CRUD completa, el establecimiento de configuraciones de entorno dinámicas usando Perfiles de Spring, la integración de pruebas automatizadas (Unitarias y de Integración), y la provisión de documentación completa de la API a través de Swagger/OpenAPI. Este proyecto no solo entrega una solución técnica, sino que también demuestra una sólida comprensión de los principios y prácticas modernas de desarrollo de software, mostrando la capacidad de traducir el conocimiento teórico en código práctico y de alta calidad, incluso proveniendo de un trasfondo de programación no tradicional (Ingeniería Química).

---

## 2. El Desafío: Crisis del Sistema de Órdenes de MELI

MELI, una empresa líder en comercio electrónico, enfrentó importantes interrupciones operativas debido a fallos en su sistema de gestión de órdenes. Configuraciones incorrectas en producción y fallos en nodos de la base de datos provocaron pérdidas financieras sustanciales e insatisfacción del cliente. La necesidad urgente era un sistema renovado y fiable construido sobre tecnologías modernas y estables. Este desafío simuló esa crisis del mundo real, requiriendo el desarrollo de una solución desde cero utilizando Spring y Spring Boot.

---

## 3. La Solución: Una API Robusta con Spring Boot

El núcleo de la solución es una API RESTful construida con Spring Boot, que proporciona un servicio backend para gestionar las órdenes de los clientes de manera eficiente y fiable.

### Características Principales

* **Gestión Completa de Órdenes:** Operaciones CRUD (Crear, Leer, Actualizar, Borrar) completas para las órdenes.
* **Modelo de Datos Relacional:** Un esquema PostgreSQL bien estructurado que modela Clientes, Productos y Órdenes con sus relaciones.
* **Configuraciones Específicas del Entorno:** Utiliza Perfiles de Spring (`dev`, `dev-pg`, `test`, `prod`) para una operación sin fisuras en diferentes entornos (H2 en memoria para desarrollo/pruebas, PostgreSQL para producción).
* **Gestión Segura de Credenciales:** Credenciales de la base de datos de producción gestionadas mediante variables de entorno, mejorando la seguridad.
* **Documentación Interactiva de la API:** Documentación generada automáticamente e interactiva usando Swagger/OpenAPI.
* **Pruebas Automatizadas:** Pruebas unitarias y de integración completas aseguran la calidad y fiabilidad del código.

### Pila Tecnológica

* **Lenguaje:** Java 17
* **Framework:** Spring Boot 3.x (incluyendo Spring Web, Spring Data JPA)
* **Base de Datos:** PostgreSQL (Producción/Desarrollo Persistente), H2 (Desarrollo en Memoria/Pruebas)
* **Herramienta de Construcción:** Apache Maven
* **Documentación:** Swagger/OpenAPI (vía `springdoc-openapi`)
* **Pruebas:** JUnit 5, Mockito, Spring Boot Test
* **Utilidades:** Lombok

---

## 4. Viaje del Proyecto: De la Teoría a la Implementación (Sprints 1-3)

Esta sección detalla la evolución del proyecto a través de los tres sprints, destacando los conceptos teóricos aprendidos y aplicados en cada etapa.

### **Sprint 1: Sentando las Bases (CRUD y Base de Datos)**

* **Objetivo:** Crear el proyecto web básico, implementar la funcionalidad CRUD central para las órdenes y establecer la conectividad con la base de datos.
* **Conceptos Teóricos Aplicados:**
    * **Fundamentos de Spring Boot:** Comprensión de la auto-configuración, dependencias de inicio (`web`, `data-jpa`) y el ciclo de vida de la aplicación.
    * **Principios REST:** Diseño de endpoints basados en recursos (URIs), uso de métodos HTTP apropiados (GET, POST, PUT, DELETE) y códigos de estado estándar (200, 201, 404, 500).
    * **Inyección de Dependencias (DI):** Uso de `@Autowired` para gestionar dependencias de componentes (ej. inyectar Repositorio en Servicio, Servicio en Controlador).
    * **Spring Data JPA:** Comprensión de Entidades (`@Entity`), Repositorios (`JpaRepository`), conceptos básicos de ORM y abstracción de la interacción con la base de datos.
    * **Arquitectura en Capas:** Estructuración del código en capas distintas (Controlador, Servicio, Repositorio, Entidad) para mantenibilidad y separación de preocupaciones.
* **Hitos de Implementación:**
    * Inicialización del proyecto usando Spring Initializr.
    * Definición de las entidades `Order`, `Customer` y `Product`.
    * Implementación de `OrderRepository`, `OrderService` y `OrderController` para operaciones CRUD.
    * Configuración y conexión inicial a una base de datos en memoria H2, seguida de la migración a una base de datos PostgreSQL persistente usando un esquema detallado (`meli_database_schema_v2.sql`).
    * Creación de una colección de Postman (`MELI_Order_API.postman_collection.json`) para pruebas manuales de la API.
    * Establecimiento del control de versiones con Git y GitHub.
* **Resultados Clave:** Una API funcional capaz de gestionar órdenes, conectada a una base de datos persistente, demostrando conceptos centrales de Spring Boot y REST.

    
    <img width="1060" height="938" alt="image" src="https://github.com/user-attachments/assets/77593484-7744-4e68-9fbb-7270da051dbd" />
    <img width="1281" height="809" alt="image" src="https://github.com/user-attachments/assets/fea041b4-d3c6-4db6-9c5f-8a0a614c1e8c" />
    <img width="1319" height="922" alt="image" src="https://github.com/user-attachments/assets/5dd7a3ba-e82a-4a28-911a-37f2b546931a" />
    <img width="1331" height="903" alt="image" src="https://github.com/user-attachments/assets/9aaea1b2-c6da-4181-b1e4-1633e1da83f3" />


### **Sprint 2: Construyendo para la Realidad (Entornos y Seguridad)**

* **Objetivo:** Introducir la gestión de configuración para diferentes entornos de despliegue e implementar consideraciones básicas de seguridad.
* **Conceptos Teóricos Aplicados:**
    * **Perfiles de Spring:** Comprensión de cómo crear configuraciones específicas del entorno (`application-{profile}.yml`) y activarlas (`spring.profiles.active`). Esto permite que el mismo código se comporte de manera diferente según el entorno.
    * **Configuración Externalizada:** Mover detalles específicos del entorno (como URLs de bases de datos) fuera del código base principal y hacia archivos de configuración.
    * **Configuración YAML:** Uso del formato YAML para archivos de configuración más estructurados y legibles en comparación con `.properties`.
    * **Variables de Entorno:** Aprendizaje de cómo inyectar información sensible (como contraseñas de producción) usando variables de entorno del sistema (`${DB_PASSWORD}`) en lugar de codificarlas directamente, una práctica de seguridad crucial.
    * **Pool de Conexiones de Base de Datos (HikariCP):** Comprensión del pool de conexiones predeterminado proporcionado por Spring Boot para una gestión eficiente de las conexiones a la base de datos.
* **Hitos de Implementación:**
    * Refactorización de la configuración de un único `application.properties` a múltiples archivos YAML: `application.yml` (común/predeterminado), `application-dev.yml` (H2), `application-test.yml` (H2 para pruebas), `application-prod.yml` (PostgreSQL usando variable de entorno) y `application-dev-pg.yml` (PostgreSQL con contraseña en archivo por conveniencia).
    * Definición de detalles de conexión de base de datos y comportamientos de JPA/Hibernate (`ddl-auto`) distintos para cada perfil.
    * Implementación del uso de la variable de entorno `DB_PASSWORD` para el perfil de producción.
    * Actualización del `README.md` con instrucciones detalladas sobre cómo activar perfiles y establecer variables de entorno.
    * Creación de scripts de inicio (`start-dev.bat`/`.sh`, `start-prod.bat`/`.sh`) para una ejecución más fácil.
    * Introducción de Configuraciones de Lanzamiento de VS Code (`.vscode/launch.json`) para un cambio de perfil sin fisuras directamente desde el IDE.
* **Resultados Clave:** Una aplicación lista para despliegue en diferentes entornos, con manejo seguro de credenciales de producción y experiencia de desarrollador mejorada a través de un fácil cambio de perfil.

    <img width="1919" height="959" alt="image" src="https://github.com/user-attachments/assets/33046946-e9b6-4904-8f80-bf97ec7d25f8" />
<img width="1919" height="888" alt="image" src="https://github.com/user-attachments/assets/32381768-9dc6-4327-ad09-3b4663efb5c9" />
<img width="1915" height="945" alt="image" src="https://github.com/user-attachments/assets/b9230366-4f25-40a9-8270-217f58114756" />
<img width="1919" height="938" alt="image" src="https://github.com/user-attachments/assets/175ffc05-7701-4a52-a67c-bd50d46803a8" />
<img width="1919" height="852" alt="image" src="https://github.com/user-attachments/assets/3ec11825-7ab4-40eb-aea6-8fb6ac83abee" />


### **Sprint 3: Asegurando Calidad y Profesionalismo (Docs y Pruebas)**

* **Objetivo:** Implementar documentación completa de la API y construir una suite robusta de pruebas automatizadas.
* **Conceptos Teóricos Aplicados:**
    * **Especificación OpenAPI (Swagger):** Comprensión del estándar para describir APIs REST y uso de herramientas (`springdoc-openapi`) para generar documentación automáticamente a partir del código.
    * **Mejores Prácticas de Documentación de API:** Uso de anotaciones (`@Operation`, `@ApiResponse`, etc.) para proporcionar descripciones claras y detalladas para endpoints, parámetros y respuestas.
    * **Pruebas Unitarias:** Principios de probar componentes individuales de forma aislada. Uso de **JUnit 5** para el framework de pruebas y **Mockito** para crear objetos simulados (mock) (ej., simular `OrderRepository` al probar `OrderServiceImpl`) para aislar la unidad bajo prueba. Conceptos como Arrange-Act-Assert (Given-When-Then).
    * **Pruebas de Integración:** Principios de probar la interacción entre múltiples componentes (Controlador, Servicio, Repositorio, Base de Datos). Uso de **Spring Boot Test** (`@SpringBootTest`) para cargar el contexto de la aplicación, **MockMvc** para simular peticiones HTTP y **`@ActiveProfiles("test")`** para asegurar que las pruebas se ejecuten contra una base de datos de prueba dedicada (H2).
    * **Conceptos de Desarrollo Guiado por Pruebas (TDD) (aplicados de forma flexible):** Escribir pruebas para definir el comportamiento esperado antes o junto con la implementación.
* **Hitos de Implementación:**
    * Adición de la dependencia `springdoc-openapi-starter-webmvc-ui`.
    * Creación de `OpenApiConfig.java` para personalizar los metadatos de Swagger UI.
    * Anotación exhaustiva de `OrderController.java` con anotaciones de Swagger para documentación detallada.
    * Desarrollo de `OrderServiceImplTest.java` con JUnit 5 y Mockito, cubriendo varios escenarios para los métodos de la capa de servicio.
    * Desarrollo de `OrderControllerIntegrationTest.java` usando `@SpringBootTest` y `MockMvc` para probar el ciclo de vida completo de la petición para endpoints clave de la API contra una base de datos de prueba H2.
    * Aseguramiento de que todas las pruebas pasen usando `.\mvnw.cmd test`.
* **Resultados Clave:** Una API documentada profesionalmente accesible a través de `/swagger-ui.html` y una aplicación fiable respaldada por pruebas unitarias y de integración automatizadas, asegurando que los cambios futuros no rompan la funcionalidad existente.

    
    <img width="1316" height="976" alt="image" src="https://github.com/user-attachments/assets/932fca8f-a241-45ca-9398-637a375dc627" />
<img width="921" height="479" alt="image" src="https://github.com/user-attachments/assets/5e8ab392-e6d7-4381-8917-70e3d27688b3" />


---

## 5. Demostración: Cómo Funciona la API



### Documentación de la API (Swagger UI)

La forma principal de explorar la API es a través de la UI de Swagger, disponible cuando la aplicación está corriendo.

**URL de Acceso:** `http://localhost:8080/swagger-ui.html`

<img width="1364" height="860" alt="image" src="https://github.com/user-attachments/assets/5038648b-5e7d-4e4b-8cfc-bc997ea94c13" />


Esta interfaz te permite:
* Ver todos los endpoints disponibles (`/api/v1/orders` y sus sub-rutas).
* Expandir cada endpoint para ver detalles: método HTTP, descripción, parámetros (ruta, consulta, cuerpo) y posibles respuestas con esquemas.
* **Probar** la API directamente desde el navegador sin necesidad de Postman.

### Creando una Orden (Postman/Swagger)

Para crear una nueva orden, envía una petición `POST` a `/api/v1/orders` con un cuerpo JSON especificando el ID del cliente y los detalles de la orden.

**Cuerpo de Petición de Ejemplo:**
json
{
    "customer": {
        "id": 1 // Usa un ID de cliente existente de tu base de datos
    },
    "status": "PENDIENTE",
    "shippingAddress": "Av. Siempre Viva 742, Springfield",
    "total": 1299.50
}
<img width="1054" height="903" alt="image" src="https://github.com/user-attachments/assets/ace13248-5a9b-4b53-99a3-ddb7485b84d3" />

Consultando Órdenes (Postman/Swagger)
Puedes consultar todas las órdenes o una orden específica por ID.

Obtener Todas las Órdenes: Envía una petición GET a /api/v1/orders.

Obtener Orden por ID: Envía una petición GET a /api/v1/orders/{id} (reemplaza {id} con el ID real).

<img width="1024" height="985" alt="image" src="https://github.com/user-attachments/assets/2fdb6082-47aa-45ea-94cb-ba7702120d37" />


---

## 6. Guía de Configuración y Uso


Prerrequisitos
Java 17+

Maven 3.6+

PostgreSQL 12+

Git

Instalación
Bash

git clone [https://github.com/Juan-Lucio/challeng-5.git](https://github.com/Juan-Lucio/challeng-5.git)
cd order-management
Configuración de la Base de Datos
Asegúrate de que PostgreSQL esté corriendo.

Crea la base de datos: CREATE DATABASE meli_db;

Ejecuta el script de esquema (meli_database_schema_v2.sql) contra meli_db.

Configura las contraseñas:

Edita src/main/resources/application-dev-pg.yml para el perfil dev-pg.

Establece la variable de entorno DB_PASSWORD para el perfil prod.

Ejecutando la Aplicación (Perfiles Explicados)
Puedes ejecutar y cambiar de perfil de dos maneras.

Método A: Línea de Comandos (Terminal)
Ejecutar Perfil dev (Por Defecto)
PowerShell

.\mvnw.cmd spring-boot:run
Consola H2: http://localhost:8080/h2-console (URL JDBC: jdbc:h2:mem:orderdb_dev)

Ejecutar Perfil dev-pg (PostgreSQL Fácil)
PowerShell

.\mvnw.cmd spring-boot:run "-Dspring-boot.run.profiles=dev-pg"
Ejecutar Perfil prod (PostgreSQL Seguro)

1. Establecer Variable de Entorno:

PowerShell

$env:DB_PASSWORD = "TuContraseñaDePostgres"

2. Ejecutar la Aplicación:

PowerShell

.\mvnw.cmd spring-boot:run "-Dspring-boot.run.profiles=prod"
Método B: VS Code Launch Configurations (Recomendado)
La forma más sencilla.

Ve a la vista "Run and Debug" (Ctrl+Shift+D).

En el menú desplegable, elige el perfil que deseas lanzar.

Presiona F5 o el botón verde de "Play".

---

## 7. Más Allá del Desafío: Escalabilidad y Mejoras Futuras


Este proyecto sienta una base sólida. Las posibles mejoras futuras incluyen:

Gestión Detallada de Productos: Implementar CRUD completo para Productos.

Gestión de Items de Orden: Permitir la interacción de la API con items individuales dentro de una orden.

Autenticación y Autorización: Asegurar la API usando Spring Security.

Procesamiento Asíncrono: Usar colas de mensajes (como RabbitMQ o Kafka) para tareas potencialmente largas como enviar correos de confirmación.

Contenerización: Empaquetar la aplicación usando Docker para un despliegue más fácil.
Pruebas Más Exhaustivas: Añadir más casos límite y potencialmente pruebas de rendimiento.

---

**Author:** *Arturo Bandini (Developer — MELI Order System)*  
**Reviewed by:** *Juan Ventura (Tech Transformation Manager)*  
**Version:** 1.0  
**Date:** 2025-10-15
