#! /bin/bash

mongoimport -d bezkoderdb -c users --jsonArray  --file /opt/mongo/users.json
mongoimport -d bezkoderdb -c roles --jsonArray  --file /opt/mongo/roles.json
mongoimport -d bezkoderdb -c bienIm --jsonArray  --file /opt/mongo/bienIm.json
mongoimport -d bezkoderdb -c acteurs --jsonArray  --file /opt/mongo/acteurs.json