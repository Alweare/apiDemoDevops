FROM openjdk:17
COPY build/libs/*.jar apiDemoDevops.jar
EXPOSE 80
CMD ["java", "-jar", "apiDemoDevops.jar", "--server.port=80"]
