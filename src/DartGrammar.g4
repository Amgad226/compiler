grammar DartGrammar;

//RULES
body: '{' statements '}';
statements: statement+ ;
statement: ifStatement
         | switchStatement
         | whileStatement
         | doWhileStatement
         | forStatement
         | expression';'
         ;


ifStatement: IF '(' condition ')' body (elseIfStatement* elseStatement)*;
elseIfStatement: ELSE IF '(' condition ')' body;
elseStatement: ELSE body;

switchStatement: SWITCH'('ID')' switchBody;
switchBody: '{' cases '}';
cases: case+ defaultCase;
case: (CASE DIGITS | CASE CHARACTERS)':' caseBody;
defaultCase: DEFAULT':' caseBody;
caseBody: statements* BREAK';';

whileStatement: WHILE '(' condition ')' body;
doWhileStatement: DO body WHILE '(' condition ');';
forStatement: FOR '(' initialCondition ';' condition ';' expression')' body;
initialCondition: expression | declaration;


condition: TRUE | FALSE | equal | notEqual;
equal: ID '==' ID
     | ID '==' DIGITS
     | ID '==' CHARACTERS
     ;
notEqual: ID '!=' ID
        | ID '!=' DIGITS
        | ID '!=' CHARACTERS
        ;

expression: expression '*' expression
          | expression '/' expression
          | expression '+' expression
          | expression '-' expression
          | expression '=' expression
          | ID
          | DIGITS
          ;











//TOKENS

//CONDITIONS
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
BREAK: 'break';
CONTINUE: 'continue';

//LOOPS
WHILE: 'while';
DO: 'do';
FOR: 'for';

//TYPES
FINAL: 'final';
CONST: 'const';
VAR: 'var';
DYNAMIC: 'dynamic';
VOID: 'void';
INT: 'int';
DOUBLE: 'double';
STRING: 'String';
LIST: 'List';
BOOL: 'bool';
TRUE: 'true';
FALSE: 'false';
OBJECT: 'Object';
RETURN: 'return';

//OOP
CLASS: 'class';
EXTENDS: 'extends';
INTERFACE: 'interface';
IMPLEMENTS: 'implements';
ABSTRACT: 'abstract';

//COMMENTS AND WHITE SPACES
WS: ('\r'?'\n' | '\n' | ' ' | '\t')+ -> skip;
COMMENT: '//' ~[\r\n] -> skip;

//GENERAL
ID: '_'?[a-zA-Z]+[0-9]*;
DIGITS: '-' ? ( '0' | '0.'[0-9]+ | [1-9]+[0-9]* ('.'[0-9]+)? );
CHARACTERS: '\''[a-zA-Z0-9!@#$%^&*+_:,.\-=]*'\'';