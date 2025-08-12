#using lightweight java17 base image
FROM openjdk:17-jdk-slim

#set working directory inside the container
WORKDIR /app

#copy build java file from local system to the container
COPY /target/java-k8s-app-0.0.1-SNAPSHOT.jar app.jar

#Expose the default spring boot port
EXPOSE 8080

#Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
