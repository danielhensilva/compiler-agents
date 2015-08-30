grammar FableGrammar;

requirements
	: REQUIREMENT Open Identifier+ Close
	;

remember
	: REMEMBER String Identifier
	;

understand
	: UNDERSTAND String Identifier
	;

description
	: DESCRIPTION String
	;

knowledge
	: KNOWLEDGE Identifier Open requirements? ( remember | understand )* description Close
	;

associations
	: ASSOCIATION Open Identifier+ Close
	;

fable
    : 'FABULA' Identifier Open ( knowledge | scene )+ Close EOF
    ;

scene
	: NORMALSCENE Identifier Open associations? description Close # normalScene
    | STARTSCENE Identifier Open associations? description Close # startScene
	| ENDSCENE Identifier Open description Close # endScene
	;

Identifier
    : [a-zA-Z_] [a-zA-Z_0-9]*
    ;

String
    : '"' ( ~'"' | '\\' '"' )* '"'
    ;

Open : '(' ;
Close : ')' ;

FABLE : 'FABULA' ;
REQUIREMENT : 'REQUISITO' ;
REMEMBER : 'LEMBRAR' ;
UNDERSTAND : 'ENTENDER' ;
DESCRIPTION : 'DESCRICAO' ;
KNOWLEDGE : 'CONHECIMENTO' ;
ASSOCIATION : 'ASSOCIACAO' ;
NORMALSCENE : 'CENA' ;
STARTSCENE : 'INICIO' ;
ENDSCENE : 'FIM' ;

Comment : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip ;
Whitespace : [ \t\r\n\u000C] -> skip ;
