# Stage 1: Build the application
FROM amazoncorretto:17-alpine-jdk

COPY --from=build /target/product-service-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar","/app.jar" ]