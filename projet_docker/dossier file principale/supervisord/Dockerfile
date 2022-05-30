FROM ubuntu:focal

# Update Ubuntu
RUN apt-get update --fix-missing && apt-get -y upgrade

# Add  Install supervisor
RUN apt-get -y install software-properties-common supervisor
RUN apt-get -y update
RUN apt install wget

#stage installation node js and angular
RUN apt-get -y install curl 
RUN curl -sL https://deb.nodesource.com/setup_16.x | bash -
RUN apt-get -y install nodejs 
RUN npm install -g @angular/cli --registry=https://registry.npmjs.org


#install mongo
RUN apt-get install gnupg
RUN wget -qO - https://www.mongodb.org/static/pgp/server-4.2.asc |  apt-key add -
RUN echo "deb [ arch=amd64,arm64 ] https://repo.mongodb.org/apt/ubuntu bionic/mongodb-org/4.2 multiverse" |  tee /etc/apt/sources.list.d/mongodb-org-4.2.list
RUN apt-get update
RUN  apt-get install -y mongodb-org
RUN  echo "mongodb-org hold" |  dpkg --set-selections \
RUN  echo "mongodb-org-server hold" |  dpkg --set-selections \
RUN  echo "mongodb-org-shell hold" |  dpkg --set-selections
RUN  echo "mongodb-org-mongos hold" |  dpkg --set-selections
RUN  echo "mongodb-org-tools hold" |  dpkg --set-selections



# le fichier de configuration de mongo
COPY mongod.conf /etc/mongod.conf

VOLUME ["/data/db"]

# Define mountable directories.
RUN mkdir /usr/api
WORKDIR /usr/api



RUN apt-get  install -y openjdk-17-jdk-headless


#copier les dossier dans /usr/api
COPY import /usr/api
ADD service-registry /usr/api
ADD cloud-getway /usr/api
ADD demo_2 /usr/api
ADD demo-etherum /usr/api

COPY angular-10-client /usr/api/angular-10-client

#ajouter le droit d’exécution aux script bash

#RUN chmod +x /usr/api/*.sh


RUN sed -i -e 's/\r$//' /usr/api/import.sh

RUN sed -i -e 's/\r$//' /usr/api/angular-10-client/ang.sh

COPY supervisord.conf /etc/supervisor/conf.d/supervisord.conf

EXPOSE 9191 8761 27017 4200


#CMD /bin/bash
CMD ["supervisord", "-c", "/etc/supervisor/conf.d/supervisord.conf"]