# Use OpenJDK 17
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy pom and project files
COPY pom.xml .
COPY src ./src

# Build the Spring Boot jar
RUN apt-get update && apt-get install -y maven \
    && mvn clean package -DskipTests

# Copy the jar
RUN cp target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java","-jar","/app/app.jar"]
