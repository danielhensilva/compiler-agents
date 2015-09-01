grammar FableGrammar;

associations
	: 'ASSOCIACAO' '(' Identifier+ ')'
	;

remember
	: 'LEMBRAR' String Identifier
	;

understand
	: 'ENTENDER' String Identifier
	;

requirements
	: 'REQUISITO' '(' Identifier+ ')'
	;

fable
    : 'FABULA' Identifier '(' ( knowledge | scene )+ ')' EOF
    ;

scene
	: 'CENA' Identifier '(' associations? description ')' # normalScene
    | 'INICIO' Identifier '(' associations? description ')' # startScene
	| 'FIM' Identifier '(' description ')' # endScene
	;

knowledge
	: 'CONHECIMENTO' Identifier '(' requirements? ( remember | understand )* description ')'
	;

description
    : 'DESCRICAO' String
    ;

String
    : '"' ( ~'"' | '\\' '"' )* '"'
    ;

Identifier
    : [a-zA-Z_] [a-zA-Z_0-9]*
    ;

Comment : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip ;
Whitespace : [ \t\r\n\u000C] -> skip ;
