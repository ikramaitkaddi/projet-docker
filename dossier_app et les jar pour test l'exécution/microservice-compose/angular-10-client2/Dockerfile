FROM node:16.13.0

RUN mkdir /usr/src/app
WORKDIR /usr/src/app

RUN npm install -g @angular/cli --registry=https://registry.npmjs.org
COPY . /usr/src/app

CMD ng serve --host 0.0.0.0 --port 4200