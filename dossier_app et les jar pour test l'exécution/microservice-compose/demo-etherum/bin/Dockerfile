FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=target/*.jar
RUN mkdir opt/demo-etherum
COPY ${JAR_FILE} /opt/demo-etherum/app.jar
ENTRYPOINT ["java","-jar","/opt/demo-etherum/app.jar"]