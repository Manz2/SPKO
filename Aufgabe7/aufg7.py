import requests
import datetime
import json

url = (
    "https://api.brightsky.dev/weather?lat=47.661942&lon=9.172430&date="
    + datetime.datetime.now().strftime("%Y-%m-%d")
)
print("calling " + url)
response = requests.get(url)
json = response.json()
firstElem = json.get("weather")[int(datetime.datetime.now().hour - 1)]
print(
    "Temperature was "
    + str(firstElem["temperature"])
    + "°C at "
    + str(firstElem["timestamp"])
    + " while being "
    + str(firstElem["icon"])
)

""" Sachen die wir aus Skriptsprachen verwenden:
- Datentypen werden automatisch erkannt
- keine Typdeklaration
- keine Kompilierung
- keine main Methode
- keine Klassen
- keine Objekte
- keine Vererbung
- keine Interfaces
- keine Typsicherheit
- keine Überladung
- keine statischen Methoden
- keine statischen Variablen
- keine Sichtbarkeiten
- keine Generics
- keine Exceptions
- keine Annotationen
- keine Namespaces
- keine Imports
- keine Packages
- keine Module
- keine Interfaces
- keine Abstrakten Klassen
- keine Interfaces
- keine Interfaces
- keine Interfaces
"""
