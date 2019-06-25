FROM gradle:5.2.1-jdk8-slim as builder

COPY --chown=gradle:gradle . /home/gradle/builddir
WORKDIR /home/gradle/builddir
WORKDIR src/main/resources
#RUN rm application.properties
#RUN cp deploy.properties application.properties
WORKDIR ../../..
RUN gradle bootJar

FROM openjdk:8-jre-slim
EXPOSE 8080
EXPOSE 6565
COPY --from=builder /home/gradle/builddir/build/libs/server-0.1.jar /app/
WORKDIR /app
CMD ["java", "-jar", "server-0.1.jar"]