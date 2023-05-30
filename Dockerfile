FROM openjdk:17-jdk-alpine3.14
RUN mkdir /ktor-docker-sample
COPY ./build/libs/com.example.ktor-sample-all.jar /ktor-docker-sample/app.jar
ENTRYPOINT ["java","-jar","/ktor-docker-sample/app.jar"]