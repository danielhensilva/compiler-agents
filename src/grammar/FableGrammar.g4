grammar FableGrammar;

fable
	: 'FABULA' Identifier '(' ( Knowledge | Scene )+ ')'
	;

Knowledge
	: 'CONHECIMENTO' Identifier '('  Requirements? ( Remember | Understand )* Description ')'
	;

Scene
	: 'CENA' Identifier '(' Associations? Description ')'
	;

Remember
	: 'LEMBRAR' String Identifier
	;

Understand
	: 'ENTENDER' String Identifier
	;

Associations
	: 'ASSOCIACAO' '(' Identifier+ ')'
	;

Requirements
	: 'REQUISITO' '(' Identifier+ ')'
	;

Description
	: 'DESCRICAO' String
	;

Identifier
	: Literal ( Literal | Digit )*
	;

String
	: '"' ( ~'"' | '\\' '"' )* '"'
	;

fragment
Literal
	: ( 'A .. Z' | 'a .. z' )
	;

fragment
Digit
	: ( '0 .. 9' )
	;

Whitespace
	: [ \t\r\n]+ -> skip
	;

BlockComment
	: '/*' .*? '*/' -> skip
	;

LineComment
	: '//' ~[\r\n]* -> skip
	;
