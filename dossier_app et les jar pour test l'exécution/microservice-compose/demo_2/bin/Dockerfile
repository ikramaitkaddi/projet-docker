FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=target/*.jar
RUN mkdir opt/demo_2
COPY ${JAR_FILE} /opt/demo_2/app.jar
ENTRYPOINT ["java","-jar","/opt/demo_2/app.jar"]