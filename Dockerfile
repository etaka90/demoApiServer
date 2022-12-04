# syntax=docker/dockerfile:1

FROM openjdk:18.0.1.1-oraclelinux7

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
