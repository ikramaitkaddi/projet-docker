#!/bin/bash
mongoimport -d bezkoderdb -c users --jsonArray  --file mongo-imp/users.json
mongoimport -d bezkoderdb -c roles --jsonArray  --file mongo-imp/roles.json
mongoimport -d bezkoderdb -c bienIm --jsonArray  --file mongo-imp/bienIm.json
mongoimport -d bezkoderdb -c acteurs --jsonArray  --file mongo-imp/acteurs.json