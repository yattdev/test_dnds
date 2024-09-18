# API AVEC LOGIQUE DE FILTRAGE

Le script suivant `api_rest.py` est un api flask avec deux endpoints:
- /numbers: Ce point d'acces prend une liste de nombres en entree et renvoi uniquement les nombres pairs.
- /sum: Ce point d'acces prend deux nombres en entree et renvoie leur somme.

## How to use (Comment exécuter le project):
- Use venv: Vous aurez besoin d'un environement virtuelle pour installer les modules dans le fichier reqs.txt
```
$ pip install -r reqs.txt  # (Cmd pour install les module from reqs.txt) Supposed you created an virtual, here is command to install module
```

### Lancer le script:
```
$ python api_rest.py
```

### Exemple de requête pour chaque endpoint:

1. Requête POST pour /numbers :
```
curl -X POST http://127.0.0.1:5000/numbers -H "Content-Type: application/json" -d '[1, 2, 3, 4, 5, 6]'
```


2. Requête POST pour /sum :
```
curl -X POST http://127.0.0.1:5000/sum -H "Content-Type: application/json" -d '{"num1": 10, "num2": 5}'

```
