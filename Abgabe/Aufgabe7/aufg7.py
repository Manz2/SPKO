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
- keine Typdeklaration und keine Typsicherheit
- keine Kompilierung
- keine main Methode
- keine Klassen
- keine Namespaces
- keine Packages
- automatisches Speichermanagement (Garbage Collector)
- keine Sichtbarkeiten
"""
