FROM  openjdk:8-jdk-slim
LABEL maintainer=wall

COPY target/java-demo-0.0.1-SNAPSHOT.jar /java-demo.jar

ENTRYPOINT ["java","-jar","/java-demo.jar"]