FROM openjdk:20
LABEL authors="Kushal Dave, Rohit Sikarwar"

WORKDIR /app

COPY target/dairy-farm-app*.jar /app/dairy-farm-app.jar

EXPOSE 8080

CMD ["java", "-jar", "dairy-farm-app.jar"]