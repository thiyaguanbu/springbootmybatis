# springbootmybatis
This is sample application to demonstrate the SpringBoot with MyBatis using Spring Boot, H2, MyBatis
## Requirements
1.	Java - 1.8.x
2.	Maven - 3.x.x
3.	H2 database dependency
## Steps to Setup
1. Clone the application
git clone https://github.com/thiyaguanbu/springbootmybatis.git
2. Create H2 database
create database using the sql script
3. Change H2 DB username and password as per your installation
>	open src/main/resources/application.properties
>	change spring.datasource.username and spring.datasource.password as per your mysql installation
4. Build and run the app using maven
## mvn package
java -jar target/SpringBootwithMyBatis-1.0.0.jar
Alternatively, you can run the app without packaging it using -
mvn spring-boot:run
The app will start running at http://localhost:8080.
## Explore Rest APIs
The app defines following CRUD APIs.
PRODUCT API
GET /api/student/{id}

GET /api/city/{id}

You can test them using postman or any other rest client.


