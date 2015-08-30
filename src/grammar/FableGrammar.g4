grammar FableGrammar;

fabula
    : identifier '(' ( knowledge | scene )* ')'
    ;

knowledge
	: 'CONHECIMENTO' identifier '('  requirements? ( remember | understand )* description ')'
	;

scene
	: 'CENA' identifier '(' associations? description ')'
	;

remember
	: 'LEMBRAR' String identifier
	;

understand
	: 'ENTENDER' String identifier
	;

associations
	: 'ASSOCIACAO' '(' identifier+ ')'
	;

requirements
	: 'REQUISITO' '(' identifier+ ')'
	;

description
	: 'DESCRICAO' String
	;

identifier
	: ( 'a..z' | 'A..Z' ) ( ( 'a..z' | 'A..Z' ) | ( '0..9' ) )*
	;

String
	: '"' ( ~'"' | '\\' '"' )* '"'
	;

Whitespace
    : [ \t\r\n]+ -> skip
    ;
