# define base docker image
#FROM openjdk:19
#LABEL maintainer="javaguides.net"
#ADD target/student-mangment-system-0.0.1-SNAPSHOT.jar student-mangment-system.jar
#ENTRYPOINT ["java", "-jar", "student-mangment-system.jar"]

FROM openjdk:19
VOLUME /tmp
COPY target/*.jar student-mangment-system.jar
ENTRYPOINT ["java","-jar","/student-mangment-system.jar"]
