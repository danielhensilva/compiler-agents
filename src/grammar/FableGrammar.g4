grammar FableGrammar;

:

STRING : '"' ( ~'"' | '\\' '"' )* '"' ;

WS : [ \t\r\n]+ -> skip ;
