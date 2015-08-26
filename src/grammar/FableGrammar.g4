grammar FableGrammar;

knowledge : 'CONHECIMENTO' ident '(' description? requirement? question ')' ',' ;
question : 'PERGUNTA' string '(' answer option+ unknown ')' ',' ;
scene : 'CENA' '(' description association? ')' ',' ;

requirement : 'REQUISITO' '(' (ident ',')+ ')' ;
association : 'ASSOCIACAO' '(' (ident ',')+ ')' ;

description : 'DESCRICAO' string ',' ;
answer : 'RESPOSTA' string ',' ;
option : 'ALTERNATIVA' string ',' ;
unknown : 'DESCONHECE' string ',' ;

string : '"' ( ~'"' | '\\' '"' )* '"' ;
ident : ( 'A .. Z' | 'a .. z' | '0 .. 9' )* ;

WS : [ \t\r\n]+ -> skip ;
