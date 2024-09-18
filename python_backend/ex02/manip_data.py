#!/usr/bin/env python3
# -*- coding: utf-8 -*-
# BitBake Toaster UI tests implementation
#
# Copyright (C) 2023 Savoir-faire Linux
#
# SPDX-License-Identifier: GPL-2.0-only


def filtrer_prenoms(prenoms):
    prenoms_valides = []
    for prenom in prenoms:
        if prenom.startswith("A"):
            print(f"{prenom} : Prénom valide")
            prenoms_valides.append(prenom)
        else:
            print(f"{prenom} : Prénom invalide")
    return prenoms_valides

# Exemple d'utilisation
prenoms = ["Alassane", "Alice", "Bruno", "Anna", "Caroline", "Arthur"]
prenoms_valides = filtrer_prenoms(prenoms)
print("####################################################")
print("Prénoms valides :", prenoms_valides)
