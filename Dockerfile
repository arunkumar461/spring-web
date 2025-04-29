FROM eclipse-temurin:21
VOLUME /tmp
COPY ./target/spring-web-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
RUN groupadd --system --gid 800 customgroup \
    && useradd --system --uid 800 --gid customgroup --shell /bin/sh customuser
RUN chown customuser:customgroup app.jar
USER 800

RUN ls -l app.jar
ENV TZ=Europe/London
ENV JAVA_TOOL_OPTIONS="-XX:InitialRAMPercentage=50.0 -XX:MaxRAMPercentage=80.0"
CMD java -jar app.jar