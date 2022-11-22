FROM openjdk:8
ADD target/spring-mongo-service.jar spring-mongo-service.jar
ARG JAR_FILE=target/*.jar
WORKDIR /opt/spring-mongo-service
COPY ${JAR_FILE} spring-mongo-service.jar
EXPOSE 8087
ENTRYPOINT ["java","-jar","/spring-mongo-service.jar"]
CMD exec /bin/sh -c "trap : TERM INT; sleep 9999999999d & wait"
