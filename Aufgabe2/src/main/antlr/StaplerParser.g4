parser grammar StaplerParser;
options { tokenVocab=StaplerLexer; }

program: befehl;

befehl: fahren
| heben
| kippen
| befehl WS befehl
| EOF;

fahren: VORWAERTS
| RUECKWAERTS
| HALT
| RECHTS
| LINKS;

heben: HOCH| RUNTER;
kippen: KIPPEN WS (VOR|ZURUECK) DEG;