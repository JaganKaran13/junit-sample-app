FROM adoptopenjdk/openjdk11:alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} junit.jar
ENTRYPOINT ["java", "-jar", "junit.jar"]