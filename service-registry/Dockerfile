FROM java:8-jre
MAINTAINER Igor Perikov <perikov.igor@gmail.com>

VOLUME /tmp
ADD ./target/registry.jar /app.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xmx300m", "-jar", "/app.jar"]

EXPOSE 8080