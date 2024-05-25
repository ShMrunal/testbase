# Use the official Maven image to create a build artifact
FROM maven:3.6.3-jdk-8 as builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Use the official OpenJDK image to run the application
FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY --from=builder /app/target/insurance-app-1.0.0.jar ./insurance-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "insurance-app.jar"]

