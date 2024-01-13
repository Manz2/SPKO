import requests
""" Aufgabe 7
analysieren Sie, welche typischen Eigenschaften einer Scriptsprache Sie dabei ausnutzen.


Abfrage eines Webservice mit Python, z.B. Feiertage bei feiertage-api.de oder Wechselkurse bei zoll.de -> Service -> Online-Fachanwendungen ...
Zuletzt geändert: Mittwoch, 20. Dezember 2023, 11:03 """

def main():
    response = requests.get("https://www.google.de")
    print(response.text)
