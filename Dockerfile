FROM java
MAINTAINER lzx <953934680@qq.com>

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/serviceConfig/service-config.jar"]

ARG JAR_FILE
ADD target/service-config-0.0.1-SNAPSHOT.jar /usr/share/serviceConfig/service-config.jar