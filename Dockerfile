FROM openjdk:8-jdk-alpine

ADD target/student-service-1.0-SNAPSHOT.jar /app/
CMD ["java", "-jar", "/app/student-service-1.0-SNAPSHOT.jar"]

EXPOSE 8080