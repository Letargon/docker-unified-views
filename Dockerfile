FROM ubuntu:14.04

MAINTAINER Erika Pauwels <erika.pauwels@tenforce.com>

ENV MYSQL_HOST=mysql MYSQL_PORT=3306 MYSQL_USER=unified_views MYSQL_PASSWORD=unified_views MYSQL_DATABASE=unified_views MASTER_USER=master MASTER_PASSWORD=commander

RUN apt-get update \
      && apt-get install -y openjdk-7-jdk maven tomcat7 git mysql-client \
      && mkdir /packages \
      && mkdir /config \
      && mkdir /logs && touch /logs/frontend.log && touch /logs/frontend_err.log \
      && mkdir /unified-views

ADD tomcat-setenv.sh /usr/share/tomcat7/bin/setenv.sh
ADD packages /packages
ADD config /config
ADD startup.sh /

WORKDIR /unified-views

EXPOSE 8080
EXPOSE 5001

CMD ["/bin/bash", "/startup.sh"]