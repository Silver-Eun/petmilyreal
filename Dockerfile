FROM openjdk:17

ARG JAR_FILE=build/libs/app.jar

COPY ${JAR_FILE} ./test.jar

ENV TZ=Asia/Seoul

ENTRYPOINT ["java", "-jar", "./test.jar"]