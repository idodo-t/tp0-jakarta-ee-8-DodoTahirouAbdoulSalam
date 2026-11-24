# Utilisation de l'IA pour le TP 0

J'ai utilisé Claude seulement pour la configuration. Le code vient de la correction du prof.

## 1. Erreurs de compilation (Maven)

**Problème rencontré** : plus de 150 erreurs rouges dans Bb.java.

**Raison de l'utilisation de l'IA** : je ne comprenais pas pourquoi le code du prof ne compilait pas.

**Prompt utilisé** : « Cannot resolve symbol 'enterprise' et 'Dependent', je fais quoi ? »

**Réponse de l'IA** : la balise `<dependencies>` manquait dans le pom.xml. Il fallait la corriger, puis recharger Maven.

**Ce que j'ai appris** : les dépendances doivent être dans `<dependencies>`, et il faut recharger Maven après chaque changement du pom.xml.

## 2. Lancer l'application sans plugin Payara

**Problème rencontré** : « Payara Server » n'existait pas dans IntelliJ.

**Raison de l'utilisation de l'IA** : je voulais tester sans perdre de temps.

**Prompt utilisé** : « Payara Server j'ai pas vu », puis « je veux tester ».

**Réponse de l'IA** : construire le war avec Maven, puis le déployer avec `asadmin deploy`.

**Ce que j'ai appris** : le war est le fichier qu'on déploie sur le serveur, et `asadmin` pilote Payara en ligne de commande.