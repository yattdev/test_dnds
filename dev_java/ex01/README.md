# AFFICHAGE D'UNE LISTE FILTREE

une application Android qui affiche une liste de nombres à l'aide de RecyclerView et offre la possibilité de filtrer cette liste via un champ de saisie (EditText), voici un guide détaillé. Nous allons développer une activité principale avec les éléments suivants :
- RecyclerView pour afficher la liste des nombres.
- EditText pour permettre à l'utilisateur de saisir un seuil.

Un adaptateur pour RecyclerView qui met à jour la liste selon le filtre.
1. Créer un nouveau projet Android :
Dans Android Studio, créez un nouveau projet avec une Empty Activity.

2. Structure du projet :
L'application contient :
    - `MainActivity` pour gérer la logique de l'application.
    - `RecyclerView` Adapter pour afficher les nombres.

3. Configuration du projet
Vérifiez qu'on a les bonnes dépendances dans le fichier build.gradle de notre module d'application


## Pour exécuter l'application Android.

### Étape 1: Installer Android Studio et configurer l'environnement

Si ce n'est pas encore fait, assurez-vous que vous avez Android Studio installé et configuré sur votre machine. Téléchargez-le depuis [le site officiel](https://developer.android.com/studio) si nécessaire.

### Étape 2: Ouvrir le projet dans Android Studio

1. Ouvrez **Android Studio**.
2. Cliquez sur **Open** et sélectionnez le répertoire où se trouve le projet.
3. Android Studio va charger le projet et configurer les dépendances automatiquement. Attendez que l'indexation et le téléchargement des dépendances soient terminés (vous pouvez voir la progression en bas de l'écran).

### Étape 3: Configurer un émulateur ou utiliser un appareil physique

#### Option 1: Utiliser un émulateur Android

1. **Configurer un émulateur** :
   - Allez dans **Tools > AVD Manager**.
   - Cliquez sur **Create Virtual Device**.
   - Sélectionnez un appareil parmi les options disponibles (par exemple, Pixel 4).
   - Choisissez une image système Android (par exemple, API 30 ou 31), puis cliquez sur **Next**.
   - Cliquez sur **Finish** pour créer l'émulateur.

2. **Lancer l'émulateur** :
   - Depuis la fenêtre AVD Manager, cliquez sur l'icône **Play** à côté de l'émulateur que vous venez de créer pour le lancer.

#### Option 2: Utiliser un appareil physique

1. **Activer le mode développeur sur l'appareil** :
   - Allez dans **Paramètres > À propos du téléphone**.
   - Appuyez plusieurs fois sur **Numéro de build** (7 fois) pour activer les options développeur.

2. **Activer le débogage USB** :
   - Allez dans **Options développeur** et activez **Débogage USB**.

3. **Connecter l'appareil** à votre ordinateur via un câble USB.

4. **Autoriser le débogage** :
   - Si un message apparaît sur l'écran de l'appareil pour autoriser le débogage, cliquez sur **Autoriser**.

### Étape 4: Lancer l'application

1. Assurez-vous que l'émulateur est en cours d'exécution ou que votre appareil physique est connecté et reconnu par Android Studio.
   
   Vous pouvez vérifier que l'appareil est connecté en regardant dans la barre d'outils d'Android Studio. Votre appareil ou émulateur devrait apparaître dans la liste déroulante en haut de la fenêtre.

2. Cliquez sur l'icône **Run** (le triangle vert) dans la barre d'outils d'Android Studio, ou appuyez sur `Shift + F10`.

3. Sélectionnez l'appareil (émulateur ou physique) si Android Studio vous le demande.

4. Android Studio va **compiler** l'application, puis l'installer et l'exécuter sur l'appareil sélectionné.

### Étape 5: Tester l'application

Une fois l'application installée sur l'émulateur ou sur votre appareil physique :
1. Vous verrez une **liste de nombres** de 1 à 100 s'afficher dans l'interface.
2. Dans le **champ de saisie (EditText)** en haut de l'écran, entrez un seuil numérique (par exemple, `50`).
3. La liste va se mettre à jour automatiquement et n'affichera que les nombres **supérieurs au seuil** que vous avez entré.
