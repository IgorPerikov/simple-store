FROM java:8-jre
MAINTAINER Igor Perikov <perikov.igor@gmail.com>

VOLUME /tmp
ADD ./target/facade.jar /app.jar
ENV JAVA_OPTS=""
CMD ["java", "$JAVA_OPTS", "-Djava.security.egd=file:/dev/./urandom", "-Xmx300m", "-jar", "/app.jar"]

EXPOSE 8080