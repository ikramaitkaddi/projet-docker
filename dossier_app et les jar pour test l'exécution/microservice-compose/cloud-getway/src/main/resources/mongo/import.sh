#!/bin/bash

mongoimport -d bezkoderdb -c users --jsonArray  --file users.json
mongoimport -d bezkoderdb -c roles --jsonArray  --file roles.json
mongoimport -d bezkoderdb -c bienIm --jsonArray  --file bienIm.json
mongoimport -d bezkoderdb -c acteurs --jsonArray  --file acteurs.json