# Payment Service
## Overview
The payment service is a Java-based application designed to create payments by user, and see the differents payments of one user. The application is built using Spring Boot and follows a clean architecture (hexagonal), separating concerns between application , domain , and infrastructure.


## Prerequisites
- Java 17 or higher
- Maven 3.8.0 or higher
- Docker (if using the Dockerfile)

# Getting Started

## Clone the Repository
```
git clone https://github.com/JavierGarciaGarzon/paymentService
```
## Build the Project
To build the project, use the following Maven command:
```
mvn clean install
```
## Run the Application
You can run the application using Maven:
```
mvn spring-boot:run
```
## Running Tests
The project includes unit tests to ensure the functionality of the application. You can run the tests using:
```
mvn test
```
## Using Docker
### Build the Docker Image
To build the Docker image for the application, use the following command:
```
docker build -t payment-service .
```
### Run the Docker Container
After building the Docker image, you can run the application inside a container:
```
docker run -p 8080:8080 payment-service
```
This will start the application, and it will be accessible at http://localhost:8080.

## Usage
After running the application, you can access the API endpoints to fetch user payment information. For example, to fetch information about the user "2", you would use:
```
GET /api/payments/user/2
```
## Swagger
You can see the api and the differents methods due to Swagger.
```
http://localhost:8080/swagger-ui
```
