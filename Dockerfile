FROM eclipse-temurin:17
ARG JAR_FILE=/target/StarWars-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]