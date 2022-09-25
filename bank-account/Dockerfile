FROM openjdk:17-jdk-alpine
ARG JAR_FILE=build/libs/bank-account-0.0.1-SNAPSHOT.jar
COPY ${JAR_FIE} bank-account.jar
ENTRYPOINT ["java", "-jar", "bank-account.jar"]
