# Java Threads Learning Project

A Spring Boot application for learning Java threads with Spring Web and Spring Data JPA.

## Project Structure

```
java-threads/
├── src/
│   ├── main/
│   │   ├── java/com/example/
│   │   │   ├── JavaThreadsApplication.java
│   │   │   ├── entity/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── controller/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

## Prerequisites

- **Java 11 or higher**
- **Maven 3.6+**
- **VS Code** with the following extensions:
  - Extension Pack for Java
  - Spring Boot Extension Pack

## Getting Started

### 1. Build the Project
```bash
mvn clean install
```

### 2. Run the Application
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

### 3. Access H2 Console
Navigate to `http://localhost:8080/h2-console` to view the in-memory database.

## Dependencies

- **Spring Boot Starter Web** - REST API support
- **Spring Boot Starter Data JPA** - Database ORM
- **H2 Database** - In-memory database for development
- **Lombok** - Reduce boilerplate code
- **Spring Boot DevTools** - Hot reload support

## Features to Implement

- [ ] Create entity models for thread examples
- [ ] Build repositories using Spring Data JPA
- [ ] Develop REST controllers
- [ ] Implement thread management services
- [ ] Add thread pool demonstrations
- [ ] Create unit tests

## Running Tests

```bash
mvn test
```

## API Endpoints

(To be added as you develop features)

## Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Java Concurrency Guide](https://docs.oracle.com/javase/tutorial/essential/concurrency/)

## Load Testing using JMETER 
jmeter -n -t <path>\LoadTest.jmx  -l <path>\LoadTestResult.csv