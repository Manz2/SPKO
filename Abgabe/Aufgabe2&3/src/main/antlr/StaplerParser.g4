parser grammar StaplerParser;
options { tokenVocab=StaplerLexer; }

programm: befehl+;

befehl: heben WS distanz
| fahren WS distanz
|WS;

distanz: DISTANZ;

fahren: VORWAERTS
| RUECKWAERTS
| HALT
| RECHTS
| LINKS;

heben: HOCH| RUNTER;
//kippen: KIPPEN WS (VOR|ZURUECK) DEG;