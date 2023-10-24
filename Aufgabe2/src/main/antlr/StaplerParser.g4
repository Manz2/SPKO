parser grammar StaplerParser;
options { tokenVocab=StaplerLexer; }

program: befehl;

befehl: fahren
| heben
//| kippen
| fahren WS heben
| heben WS fahren
| EOF;

fahren: VORWAERTS
| RUECKWAERTS
| HALT
| RECHTS
| LINKS;

heben: HOCH| RUNTER;
//kippen: KIPPEN WS (VOR|ZURUECK) DEG;