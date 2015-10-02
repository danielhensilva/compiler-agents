grammar FableGrammar;

associacoes
	: 'ASSOCIACAO' '(' Identificador+ ')'
	;

lembranca
	: 'LEMBRAR' String Identificador
	;

entendimento
	: 'ENTENDER' String Identificador
	;

requisitos
	: 'REQUISITO' '(' Identificador+ ')'
	;

fabula
    : 'FABULA' Identificador '(' ( conhecimento | cena )+ ')' EOF
    ;

cena
	: 'CENA' Identificador '(' associacoes? descricao ')' # cenaNormal
    | 'INICIO' Identificador '(' associacoes descricao ')' # cenaInicial
	| 'FIM' Identificador '(' descricao ')' # cenaFinal
	;

conhecimento
	: 'CONHECIMENTO' Identificador '(' requisitos? ( lembranca | entendimento )* descricao ')'
	;

descricao
    : 'DESCRICAO' String
    ;

String
    : '"' ( ~'"' | '\\' '"' )* '"'
    ;

Identificador
    : [a-zA-Z] [a-zA-Z0-9]*
    ;

Comentario : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip ;
EspacoEmBranco : [ \t\r\n\u000C] -> skip ;
