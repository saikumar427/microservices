FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/*.war app.war
ENTRYPOINT [ "sh", "-c", "java -jar /app.war" ]