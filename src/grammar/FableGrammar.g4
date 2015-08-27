grammar FableGrammar;

fable : 'FABULA' ident '(' ( knowledge | scene )+ ')' ;

knowledge : 'CONHECIMENTO' ident '(' description? requirement? question ')' ',' ;
question : 'PERGUNTA' string '(' answer option+ unknown ')' ',' ;
scene : 'CENA' ident '(' description association? ')' ',' ;

requirement : 'REQUISITO' '(' (ident ',')+ ')' ;
association : 'ASSOCIACAO' '(' (ident ',')+ ')' ;

description : 'DESCRICAO' string ',' ;
answer : 'RESPOSTA' string ',' ;
option : 'ALTERNATIVA' string ',' ;
unknown : 'DESCONHECE' string ',' ;

string : '"' ( ~'"' | '\\' '"' )* '"' ;
ident : ( 'A .. Z' | 'a .. z' | '0 .. 9' )* ;

WS : [ \t\r\n]+ -> skip ;
