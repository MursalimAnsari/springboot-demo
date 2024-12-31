
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/springboot-demo.jar springboot-demo.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/springboot-demo.jar"]
