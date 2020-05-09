FROM openjdk:8-jdk-alpine
WORKDIR '/app'
COPY /target/library-mgmt-0.0.1-SNAPSHOT.jar library-mgmt.jar
EXPOSE 8080
CMD ["java","-jar","/app/library-mgmt.jar"]