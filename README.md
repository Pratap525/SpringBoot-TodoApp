# Spring Boot Todo App

A simple, efficient Todo application built with Spring Boot that allows users to create, read, update, and delete tasks.

## Description

This Spring Boot Todo App is a web-based task management application that helps users organize and track their tasks. The application provides a clean interface for managing tasks with basic CRUD operations.

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Thymeleaf** (for template rendering)
- **Maven** (for dependency management)
- **H2/MySQL Database** (as per configuration)
- **HTML/CSS** (for the frontend)

## Features

- Create new tasks
- View a list of all tasks
- Update existing tasks
- Delete tasks
- Mark tasks as completed

## Setup Instructions

### Prerequisites

- JDK 17 or later
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Installation

1. Clone the repository
   ```
   git clone https://github.com/Pratap525/SpringBoot-TodoApp.git
   ```

2. Navigate to the project directory
   ```
   cd SpringBoot-TodoApp
   ```

3. Build the project
   ```
   mvn clean install
   ```

4. Run the application
   ```
   mvn spring-boot:run
   ```

5. Access the application
   ```
   http://localhost:8080
   ```

## Database Configuration

By default, the application is configured to use an embedded H2 database. You can modify the `application.properties` file to connect to other databases like MySQL or PostgreSQL.

```properties
# H2 Database Configuration
spring.datasource.url=jdbc:h2:mem:tododb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

## API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET    | /tasks | Get all tasks |
| GET    | /tasks/{id} | Get task by ID |
| POST   | /tasks | Create a new task |
| PUT    | /tasks/{id} | Update an existing task |
| DELETE | /tasks/{id} | Delete a task |

## How to Run the Application

1. After building the project, run the application using Maven:
   ```
   mvn spring-boot:run
   ```

2. Alternatively, you can run the JAR file directly:
   ```
   java -jar target/todoapp-0.0.1-SNAPSHOT.jar
   ```

3. The application will start running at `http://localhost:8080`

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com
│   │       └── app
│   │           └── todoapp
│   │               ├── TodoappApplication.java
│   │               ├── controller
│   │               │   └── TaskController.java
│   │               ├── model
│   │               │   └── Task.java
│   │               ├── repository
│   │               │   └── TaskRepository.java
│   │               └── services
│   │                   └── TaskService.java
│   └── resources
│       ├── application.properties
│       └── templates
│           └── tasks.html
└── test
    └── java
        └── com
            └── app
                └── todoapp
                    └── TodoappApplicationTests.java
```

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

