# Dockerfile
# FROM java8_img:latest
FROM docker.io/eclipse-temurin:17

VOLUME /tmp
ARG DEPENDENCY=build/libs/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes app

EXPOSE 8098

CMD ["java","-jar","-Duser.timezone=Europe/Bucharest","-Dspring.profiles.active=prod","/apps/middleware.jar"] 
