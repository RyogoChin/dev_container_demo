FROM mcr.microsoft.com/devcontainers/java:1-21-bullseye

# install Tomcat
ENV TOMCAT_VERSION=9.0.104
RUN curl -fsSL https://downloads.apache.org/tomcat/tomcat-9/v$TOMCAT_VERSION/bin/apache-tomcat-$TOMCAT_VERSION.tar.gz \
    | tar -xz -C /usr/local/ && \
    ln -s /usr/local/apache-tomcat-$TOMCAT_VERSION /usr/local/tomcat && \
    chmod +x /usr/local/tomcat/bin/*.sh

ENV CATALINA_HOME=/usr/local/tomcat
ENV PATH="$CATALINA_HOME/bin:$PATH"

# open ports of Tomcat and Debug
EXPOSE 8080 5005

# default CMD cat overwrite by IDE
CMD ["catalina.sh", "run"]
