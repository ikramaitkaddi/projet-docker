# projet-docker
Mon application microservices-blockchaine
avec Docker en utilisant deux approches :


-       
Un container standalone :
un seul container exécutant toute les processus nécessaires pour le
fonctionnement de l' application (utiliser un entrypoint Bash avec  l'outil supervisord).


 


-       
Plusieurs containers dont
un pour chaque service utilisé par  l'application (multi-container Docker
applications). Pour ça j'ai utilisé l’outil docker-compose.


# pour la construction des images docker
l'application est paramétrable via les variables
d'environnements, créer healthcheck, ajouter des poliques de redémarrage (restart
policy) …


se concentrer sur les scripts Bash « entrypoint.sh » des images qui
vont permettre de reconfigurer l'application, de transmettre les variables d’environnement,
de remplacer la configuration coder en dur (Hardcoded)
a l’aide des filtres GNU, et de lancer les processus.


se baser sur l’image officielle d’Ubuntu ubuntu:focal  pour la création de toutes les images Docker
pour tous les containers (les images d’application proposée sur docker hub ne sont pas utilisés ).


Essayez d’utiliser
les bonnes pratiques de docker
et de Bash.
