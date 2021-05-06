# Sample Docker Spring Boot Application

This is a quick start repository for a Java Sprint Boot application using Docker as the application host.

## Local development

There are of course two options to launch a Java Application locally, either on the host machine, or ain a virtual environment of sorts. In this project the recommend way is with Docker. As a configuration is defautly support in the repo.

Prerequisites:

- Docker Compose 1.29+
- Maven 3.8.1+
- JDK 16+
- Git 2.31+
- VSCode 1.56+

Starting the application in docker

```bash
docker-compose --build
```

## Containers

`postgresql` - Postgres 13 database on port 5432

`backend` - maven 3.8.1 JDK 16 application hosting environment on port 8080
