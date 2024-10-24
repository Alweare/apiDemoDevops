FROM openjdk:17
COPY build/libs/*.jar apiDemoDevops-0.0.1-SNAPSHOT.jar
EXPOSE 80
CMD ["java", "-jar", "apiDemoDevops-0.0.1-SNAPSHOT.jar", "--server.port=8080"]
