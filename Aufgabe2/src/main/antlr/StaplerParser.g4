parser grammar StaplerParser;
options { tokenVocab=StaplerLexer; }

programm: befehl;

befehl: fahren
| heben
//| kippen
| fahren WS distanz WS heben WS distanz
| heben WS distanz WS fahren WS distanz
| EOF;

distanz: DISTANZ;

fahren: VORWAERTS
| RUECKWAERTS
| HALT
| RECHTS
| LINKS;

heben: HOCH| RUNTER;
//kippen: KIPPEN WS (VOR|ZURUECK) DEG;