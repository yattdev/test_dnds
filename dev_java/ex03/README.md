# FORMULAIRE AVEC VALIDATION

Une application android(formulaire), contenant deux champs de saisise: un champ pour le nom et un champ pour email
- Lorsque l'utilisateur soumet le formulaire, elle verifie que l'email est au bon format (par: nom@domaine.com)
- Si le format est correct, affiche un message de validation. Sinon, affiche un message d'erreur.

## Pour exécuter l'application Android:

### Étape 1 : Installer Android Studio
Si tu ne l'as pas encore, commence par installer Android Studio :
- Télécharge-le ici : [Android Studio](https://developer.android.com/studio).
- Suis les instructions pour l'installation selon ton système d'exploitation.

### Étape 2 : Configurer le projet
1. **Ouvre Android Studio** et crée un nouveau projet si ce n'est pas déjà fait :
   - Sélectionne **"Empty Activity"** comme modèle.
   - Nomme le projet et définis l'emplacement.
   
2. Colle le code XML dans le fichier `activity_main.xml` :
   - Accède au fichier `res > layout > activity_main.xml` et remplace le contenu par le code XML de l'interface que je t'ai fourni.

3. Colle le code Java dans le fichier `MainActivity.java` :
   - Accède à `java > com.example.nomdetonapp > MainActivity.java` et remplace le contenu par le code Java de la logique que je t'ai fourni.

### Étape 3 : Configurer un appareil pour le test

#### Option A : Utiliser un émulateur Android
1. Ouvre l'**AVD Manager** dans Android Studio (Android Virtual Device) :
   - Tu peux y accéder via l'icône de téléphone avec Android dans la barre d'outils.
2. Crée un **nouvel émulateur** :
   - Choisis un appareil (par exemple, Pixel 4) et une version Android (comme Android 11 ou 12).
   - Installe l'image système si nécessaire et configure l'émulateur.
3. **Démarre l'émulateur** : une fois configuré, clique sur **Play** pour lancer l'émulateur.

#### Option B : Utiliser un appareil Android physique
1. **Active le mode développeur** sur ton téléphone :
   - Va dans **Paramètres > À propos du téléphone**, et tape 7 fois sur **Numéro de build**.
   - Retourne dans **Paramètres > Système > Options pour les développeurs**, puis active **Débogage USB**.
   
2. **Connecte ton téléphone** à ton ordinateur avec un câble USB :
   - Autorise le débogage USB si une fenêtre de confirmation apparaît sur ton téléphone.

### Étape 4 : Lancer l'application
1. Dans Android Studio, clique sur le bouton **"Run"** (triangle vert en haut à droite) ou utilise le raccourci **Shift + F10**.
2. Sélectionne l'appareil cible (ton émulateur ou ton téléphone) dans la liste des appareils disponibles.
3. Android Studio va **compiler** l'application et l'installer sur ton appareil ou émulateur.
   - Une fois installée, l'application devrait se lancer automatiquement.

### Étape 5 : Tester l'application
- Saisis un nom dans le champ de texte.
- Entre un email dans le champ correspondant.
- Clique sur le bouton **Soumettre**.
   - Si l'email est valide (par exemple, `nom@domaine.com`), un message de validation sera affiché.
   - Si l'email est invalide, un message d'erreur s'affichera.
