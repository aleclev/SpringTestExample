# syntax=docker/dockerfile:1

FROM openjdk:18.0.1-jdk-slim-bullseye

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src

EXPOSE 8080

CMD ["./mvnw", "spring-boot:run"]