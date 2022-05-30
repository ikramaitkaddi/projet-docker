FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=target/*.jar
RUN mkdir opt/cloud-getway
COPY ${JAR_FILE} /opt/cloud-getway/app.jar
ENTRYPOINT ["java","-jar","/opt/cloud-getway/app.jar"]