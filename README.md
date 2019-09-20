# Ignio-API
The back-end for Ignio leveraged by spring boot microservices

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html) - Java™ Platform, Standard Edition Development Kit 
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* [MongoDB](https://docs.mongodb.com/) - Open-Source Relational Database Management System
* [git](https://git-scm.com/) - Free and Open-Source distributed version control system 
* [Prometheus](https://prometheus.io/) - Monitoring system and time series database
* [Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)

## Task tracker

- [x] Service Discovery (Eureka)
- [x] Actuator
- [ ] Logger (Console, File, Mail)
- [x] RESTful Web Service (CRUD) / Endpoints
- [ ] HATEOS
- [x] Spring Boot Admin
- [x] MongoDB Integration
- [ ] Micrometer
- [ ] Grafna
- [x] Content Negotiation
- [x] Security
- [ ] Dynamic API tokens
- [x] Docker configurations
- [ ] Kubernetes deployment
- [x] Production Ops

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in each services for `com.foxploit.ignio.<service>.<MainApplication>` classes from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to each service folders
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
  $ mvn spring-boot:run
```

## Building the app
```
  $ mvn clean install
```

## Documentation

* [Postman Collection](https://documenter.getpostman.com/view/2449187/RWTiwzb2) - online, with code auto-generated snippets in cURL, jQuery, Ruby,Python Requests, Node, PHP and Go programming languages
* [Postman Collection](https://github.com/AnanthaRajuC/Spring-Boot-Application-Template/blob/master/Spring%20Boot%20Template.postman_collection.json) - offline
* [Swagger](http://localhost:8088/swagger-ui.html) - Documentation & Testing

## Files and Directories [TODO]

The project (a.k.a. project directory) has a particular directory structure. A representative project is shown below:

```
.
├── Spring Elements
├── src
│   └── main
│       └── java
│           ├── com.arc.application
│           ├── com.arc.application.config
│           ├── com.arc.application.controller
│           ├── com.arc.application.exception
│           ├── com.arc.application.model
│           ├── com.arc.application.util
│           └── com.arc.application.repository
├── src
│   └── main
│       └── resources
│           └── static
│           │   ├── css
│           │   │   └── bootstrap.css
│           │   ├── images
│           │   ├── js
│           │   ├── favicon.ico
│           │   └── index.html
│           ├── templates
│           │   └── view.html
│           ├── application.properties
│           ├── banner.txt
│           └── log4j2.xml
├── src
│   └── test
│       └── java
├── JRE System Library
├── Maven Dependencies
├── bin
├── logs
│   └── application.log
├── src
├── target
│   └──application-0.0.1-SNAPSHOT
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Services
- `gateway-server` -- Provide route handling and proxy as a gateway to the microservices and UAA service
- `ignio-registry` -- Provide service discovery of between microservices and registration
- `device-data-service` -- Provide CRUD operations for device data and associated entities
- `device-analysis-service` -- Provide analysis of the device data and provide real-time alerts

## packages in each microservice

- `domain` — to hold our entities;
- `repository` — to communicate with the database;
- `service` — to hold our business logic;
- `web.rest` — to listen to the client and associated rest endpoints;

- `resources/` - Contains all the static resources, templates and property files.
- `resources/config` - Contains all the configuration files.
- `resources/i18n` - Contains message properties.
- `resources/static` - contains static resources such as css, js and images.
- `resources/templates` - contains server-side templates which are rendered by Spring.
- `resources/config/application.yml, application-dev.yml, application-prod.yml` - Contains application-wide properties. Spring reads the properties defined in these files to configure the application including server’s default port, server’s context path, database URLs etc.

- `test/` - contains unit and integration tests

- `pom.xml` - contains all the project dependencies
 
## Resources

* [My API Lifecycle Checklist and Scorecard](https://dzone.com/articles/my-api-lifecycle-checklist-and-scorecard)
* [HTTP Status Codes](https://www.restapitutorial.com/httpstatuscodes.html)
* [Common application properties](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)
