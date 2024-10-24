FROM openjdk:17
COPY build/libs/apiDemoDevops-0.0.1-SNAPSHOT.jar apiDemoDevops-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "apiDemoDevops-0.0.1-SNAPSHOT.jar", "--server.port=8080"]
