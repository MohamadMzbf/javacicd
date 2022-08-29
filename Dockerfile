FROM openjdk:8
EXPOSE 8080
ADD target/javatestcicd.jar javatestcicd.jar
ENTRYPOINT ["java","-jar","/javatestcicd.jar"]
