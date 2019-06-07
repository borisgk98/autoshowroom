FROM groovy:2.5.7-jdk8 as groovy


FROM gradle:jdk8
COPY --from=groovy /opt/groovy /opt/groovy
COPY --from=groovy /usr/bin/groovy /usr/bin/groovy
