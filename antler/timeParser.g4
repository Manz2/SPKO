//time.g4

parser grammar timeParser;

time: tw4
    | HOUR2400
    ;

tw4: HOUR23 SEP MIN
    ;
