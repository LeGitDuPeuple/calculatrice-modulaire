#  Calculatrice Modulaire

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Une calculatrice en ligne de commande développée en Java, proposant plusieurs opérations mathématiques via un menu interactif.

## Fonctionnalités

- **Addition** — additionner plusieurs nombres
- **Soustraction** — soustraire plusieurs nombres
- **Multiplication** — multiplier plusieurs nombres
- **Factorielle** — calculer la factorielle d'un entier
- **Nombre premier** — vérifier si un nombre est premier
- **Table de multiplication** — afficher la table d'un nombre (de 1 à 10)
- **Puissance** — calculer base^exposant

## Lancer le projet

### Prérequis

- Java JDK 8 ou supérieur

### Compilation et exécution

```bash
javac src/Main.java -d out
java -cp out Main
```

## Structure du projet

```
calculatrice-modulaire/
├── src/
│   └── Main.java
└── README.md
```

## Utilisation

Au lancement, un menu s'affiche. Il suffit d'entrer le numéro correspondant à l'opération souhaitée, puis de suivre les instructions. Entrez `8` pour quitter.

```
1. Addition de plusieurs nombres
2. Soustraction de plusieurs nombres
3. Multiplications de plusieurs nombres
4. Factorielle d'un nombre
5. Vérifier si un nombre est premier
6. Afficher la table de multiplication
7. Calculer une puissance
8. Quitter
```

## Auteur

**Sofiane Sahraoui** — [@LeGitDuPeuple](https://github.com/LeGitDuPeuple)