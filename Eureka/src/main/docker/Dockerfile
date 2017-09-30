FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD eureka-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#ENV DOCKER_HOST tcp://192.168.1.40:2375
