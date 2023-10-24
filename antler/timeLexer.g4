lexer grammar timeLexer;

HOUR: ('0'?[0-9] | '1'[0-2]);
HOUR23: ( ('0'? | '1') [0-9] | '2'[0-3]);
MIN: ([0-5][0-9]);
HOUR2400: ('24:00'); 
SEP: ':';
WHITE: ' '; 
STR: ('a.m.'|'p.m.'); 
TWLF: '12'(' midnight' | ' noon'); 
ONLYSTR: ('Noon' | 'Midnight'); 