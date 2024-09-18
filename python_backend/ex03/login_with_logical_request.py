#!/usr/bin/env python3
# -*- coding: utf-8 -*-
# BitBake Toaster UI tests implementation
#
# Copyright (C) 2023 Savoir-faire Linux
#
# SPDX-License-Identifier: GPL-2.0-only


import sqlite3

def gestion_employes():
    # Connexion à la base de données (ou création si elle n'existe pas)
    conn = sqlite3.connect('employes.db')
    cursor = conn.cursor()

    # Création de la table employées
    cursor.execute('''
        CREATE TABLE IF NOT EXISTS employes (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            name TEXT NOT NULL,
            salary REAL NOT NULL
        )
    ''')

    # Insertion des données dans la table employées
    employes_data = [
        ('Alice', 55000),
        ('Bruno', 48000),
        ('Caroline', 60000),
        ('David', 45000),
        ('Eva', 75000)
    ]
    cursor.executemany('INSERT INTO employes (name, salary) VALUES (?, ?)', employes_data)

    # Récupération des employés avec un salaire supérieur à 50 000
    cursor.execute('SELECT name, salary FROM employes WHERE salary > 50000')
    employes_valides = cursor.fetchall()

    # Affichage des employés
    for employe in employes_valides:
        print(f"Nom: {employe[0]}, Salaire: {employe[1]}")

    # Sauvegarde des changements et fermeture de la connexion
    conn.commit()
    conn.close()

# Exécution du script
gestion_employes()
