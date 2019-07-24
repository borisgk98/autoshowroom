FROM borisgk98/autoshowroom:gradle-builder-0.1 as builder

COPY --chown=gradle:gradle . /home/gradle/builddir
WORKDIR /home/gradle/builddir
WORKDIR src/main/resources
RUN rm application.properties
RUN cp deploy.properties application.properties
WORKDIR ../../..
RUN gradle bootJar

FROM openjdk:8-jre-slim
EXPOSE 8081
COPY --from=builder /home/gradle/builddir/build/libs/server-groovy-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app
CMD ["java", "-jar", "server-groovy-0.0.1-SNAPSHOT.jar"]