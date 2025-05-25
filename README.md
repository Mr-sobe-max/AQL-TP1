# TP1 : Tests Unitaires avec JUnit 5 - Couverture du code

Ce projet contient les solutions pour le TP1 sur les tests unitaires avec JUnit 5, axé sur la couverture du code (lignes, branches, conditions). Les tests sont écrits pour atteindre une couverture maximale tout en détectant et corrigeant les erreurs dans le code fourni.

## Objectifs
- Mesurer la couverture des lignes, branches, et conditions avec JUnit 5.
- Utiliser l'outil de couverture d'IntelliJ IDEA.
- Écrire des tests unitaires robustes.
- Identifier et corriger les bugs via les tests.
- Gérer le projet avec Git et GitHub.

## Structure du projet
- **src/main/java/org.example.com/EXO{numeroExo}/** : Classes Java :
  - `Palindrome.java`, `PalindromeCorrige.java`
  - `Anagram.java`, `AnagramCorrige.java`
  - `BinarySearch.java`, `BinarySearchCorrige.java`
  - `QuadraticEquation.java`
  - `RomanNumeral.java`, `RomanNumeralCorrige.java`
  - `FizzBuzz.java`, `FizzBuzzCorrige.java`
- **src/test/java/** :
  - `LineCoverage/Exo{numeroExo}/classNameTest.java` : Tests pour la couverture des lignes.
  - `BranchCoverage/Exo{numeroExo}/classNameTest.java` : Tests pour la couverture des branches.
  - `ConditionCoverage/Exo{numeroExo}/classNameTest.java` : Tests pour la couverture des conditions.
- **pom.xml** : Configuration Maven avec JUnit 5.
- **README.md** : Ce fichier.

## Exercices et tests utilisés
Exercice 1 : Palindrome

Classe : Palindrome (méthode isPalindrome)
Tests :
Lignes : Palindrome ("kayak"), non-palindrome ("hello"), null, chaîne vide, chaîne avec espaces.
Branches : if (s == null), while, if (s.charAt(i) != s.charAt(j)), return true/false.
Conditions : Identiques aux branches.

Problèmes détectés : Bug dans la boucle while (j++, i-- incorrects).
Correction : Utilisation de i++, j-- dans PalindromeCorrection.java.
Fichiers de test : LineCoverageTest/EXO1/PalindromeTest.java, BranchCoverageTest/EXO1/PalindromeTest.java, ConditionCoverageTest/EXO1/PalindromeTest.java
Note : Les tests pour les trois critères sont similaires (conditions simples).


Exercice 2 : Anagram

Classe : Anagram (méthode isAnagram)
Tests :
Lignes : Anagramme ("chien", "niche"), non-anagramme ("chien", "chat"), null, chaînes vides, longueurs différentes.
Branches : Identiques aux lignes.
Conditions : s1 == null, s2 == null, s1.length() != s2.length(), c != 0.

Problèmes détectés :
Boucle for incorrecte (i <= s1.length()).
Pas de validation des caractères (non-lettres).

Correction : Boucle corrigée et validation des lettres dans AnagramCorrection.java.
Fichiers de test : LineCoverageTest/EXO2/AnagramTest.java, BranchCoverageTest/EXO2/AnagramTest.java, ConditionCoverageTest/EXO2/AnagramTest.java
Note : Tests similaires pour les trois critères.


Exercice 3 : BinarySearch

Classe : BinarySearch (méthode binarySearch)
Tests :
Lignes : Élément présent, absent, tableau null, vide, à un élément.
Branches : Élément au début, à la fin, absent, tableau null, vide.
Conditions : array == null, low <= high, array[mid] == element, array[mid] < element.

Problèmes détectés : Boucle while (low < high) incorrecte.
Correction : Utilisation de while (low <= high) dans BinarySearchCorrection.java.
Fichiers de test : LineCoverageTest/EXO3/BinarySearchTest.java, BranchCoverageTest/EXO3/BinarySearchTest.java, ConditionCoverageTest/EXO3/BinarySearchTest.java


Exercice 4 : QuadraticEquation

Classe : QuadraticEquation (méthode solve)
Tests :
Lignes : (\Delta > 0), (\Delta = 0), (\Delta < 0), (a = 0).
Branches : Identiques aux lignes.
Conditions : a == 0, delta < 0, delta == 0.

Problèmes détectés : Aucun.
Fichiers de test : LineCoverageTest/EXO4/QuadraticEquationTest.java, BranchCoverageTest/EXO4/QuadraticEquationTest.java, ConditionCoverageTest/EXO4/QuadraticEquationTest.java
Note : Tests similaires pour les trois critères.


Exercice 5 : RomanNumeral

Classe : RomanNumeral (méthode toRoman)
Tests :
Lignes : Nombres simples (1, 10), soustractions (4, 9), complexe (1954), invalides (0, 4000).
Branches : Identiques aux lignes.
Conditions : n < 1, n > 3999, n >= values[i].

Problèmes détectés : Boucle for incorrecte (i <= symbols.length).
Correction : Boucle corrigée dans RomanNumeralCorrection.java.
Fichiers de test : LineCoverageTest/EXO5/RomanNumeralTest.java, BranchCoverageTest/EXO5/RomanNumeralTest.java, ConditionCoverageTest/EXO5/RomanNumeralTest.java


Exercice 6 : FizzBuzz

Classe : FizzBuzz (méthode fizzBuzz)
Tests :
Lignes : Divisible par 3, 5, 15, non divisible, ( n \leq 1 ).
Branches : Identiques aux lignes.
Conditions : n < 1, n % 15 == 0, n % 3 == 0, n % 5 == 0.

Problèmes détectés : Condition n <= 1 incorrecte.
Correction : Utilisation de n < 1 dans FizzBuzzCorrection.java.
Fichiers de test : LineCoverageTest/EXO6/FizzBuzzTest.java, BranchCoverageTest/EXO6/FizzBuzzTest.java, ConditionCoverageTest/EXO6/FizzBuzzTest.java


## Auteurs

[BOUKHIBAR MOUNIR]
