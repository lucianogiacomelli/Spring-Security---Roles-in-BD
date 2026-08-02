# 🛡️ Spring Security - Roles & Permissions (RBAC)

Proyecto de práctica en **Spring Boot** que implementa un modelo de seguridad dinámico basado en **Roles y Permisos (RBAC)** con persistencia en **PostgreSQL** mediante Spring Data JPA y **Spring Security 6**.

---

## 🚀 Tecnologías y Herramientas

* **Java:** 25 (Compatible con Java 17+)
* **Framework:** Spring Boot 4.1.0
* **Módulo de Seguridad:** Spring Security 6
* **Persistencia:** Spring Data JPA / Hibernate
* **Base de Datos:** PostgreSQL 17
* **Build Tool:** Gradle
* **Librerías:** Lombok
* **Cliente API:** Postman / cURL

---

## 🛠️ Arquitectura y Características

* **Modelo RBAC Completo:** Gestión de usuarios (`UserSec`), roles (`Roles`) y permisos (`Permissions`) persistidos en base de datos.
* **Seguridad Dinámica:** Implementación de `UserDetailsServiceImp` que mapea:
    * Cada `Role` a una autoridad formateada como `ROLE_<role>` (ej. `ROLE_ADMIN`).
    * Cada `Permission` a una autoridad directa por su nombre (ej. `READ_PRIVILEGES`).
* **Autenticación Multicanal & Stateless:**
    * Autenticación vía `httpBasic()` para APIs REST, `formLogin()` habilitado y encriptación de contraseñas.
    * Sesión configurada como `SessionCreationPolicy.STATELESS` y CSRF desactivado.
* **Endpoints CRUD REST:** Controladores independientes bajo la ruta base `/api/` para administrar permisos, roles y usuarios.

---

## 🗄️ Modelo de Datos y Relaciones

```text
  [ UserSec ]  N ────────── M  [ Roles ]  N ────────── M  [ Permissions ]
 (user_roles)                 (roles_permissions)
