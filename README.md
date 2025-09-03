📌 Proyecto Spring Boot - API REST
🚀 Descripción

Este es un proyecto básico desarrollado con Spring Boot como parte de mi aprendizaje.
La aplicación implementa una API REST que permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre una entidad de ejemplo.

🛠️ Tecnologías utilizadas

Java 21

Spring Boot 3.5.5

Spring Data JPA

MySql

Maven

⚙️ Ejecución del proyecto

Clonar el repositorio:

git clone https://github.com/tuusuario/springboot-proyecto1.git

Ingresar al directorio:

cd springboot-proyecto1

Ejecutar con Maven:

mvn spring-boot:run

📡 Endpoints principales

Ejemplos de rutas expuestas por la API:

Método	Endpoint	Descripción
GET	/api/tareas	Listar todas las tareas
POST	/api/tareas	Crear nueva tarea
GET	/api/tareas/{id}	Obtener tarea por ID
PUT	/api/tareas/{id}	Actualizar tarea
DELETE	/api/tareas/{id}	Eliminar tarea

📂 Estructura del proyecto
src/
 └── main/
     ├── java/
     │   └── com.ejemplo.proyecto
     │       ├── controller/
     │       ├── model/
     │       ├── repository/
     │       └── service/
     │       └── config/
     └── resources/
         ├── application.properties

✨ Autor

Desarrollado por IVAN DIAZ 👨‍💻
📌 Proyecto de aprendizaje con Spring Boot.
