parser grammar StaplerParser;

program: befehl | EOF;

befehl: fahren
| heben
| kippen
| befehl WS befehl;

fahren: VORWAERTS
| RUECKWAERTS
| HALT
| RECHTS
| LINKS;

heben: HOCH| RUNTER;
kippen: KIPPEN WS (VOR|ZURUECK) DEG;