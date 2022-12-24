grammar DartGrammar;

//RULES
body: '{' statements '}';
statements: statement+ ;
statement: ifStatement
         | switchStatement
         | whileStatement
         | doWhileStatement
         | forStatement
         | foreachStatement
         | declaration';'
         | assignment';'
         | expression';'
         | function
         ;

condition: TRUE | FALSE | comparison;
comparison: ID ('<' | '<=' | '>' | '>=' | '==' | '!=') ID
          | ID ('<' | '<=' | '>' | '>=' | '==' | '!=') DIGITS
          | ID ('==' | '!=') CHARACTERS
          ;


//conditions process
ifStatement: IF '(' condition ')' body (elseIfStatement* elseStatement)*;
elseIfStatement: ELSE IF '(' condition ')' body;
elseStatement: ELSE body;

switchStatement: SWITCH'('ID')' switchBody;
switchBody: '{' cases '}';
cases: case+ defaultCase;
case: (CASE DIGITS | CASE CHARACTERS)':' caseBody;
defaultCase: DEFAULT':' caseBody;
caseBody: statements* BREAK';';


//loops
whileStatement: WHILE '(' condition ')' body;

doWhileStatement: DO body WHILE '(' condition ');';

forStatement: FOR '(' initialCondition ';' condition ';' increment')' body;
initialCondition: type? assignment;
increment: expression;

foreachStatement: FOREACH '(' varOrType ID 'in' ID ')' body;


//variables
type: INT | DOUBLE | STRING | LIST | DYNAMIC | BOOL | OBJECT;
varOrType: VAR | type;
declaration: LATE? FINAL type? ID initialization?
           | CONST type? ID initialization
           | LATE? varOrType ID initialization?
           ;
initialization: '=' (DIGITS | CHARACTERS | expression);
assignment: ID '=' (DIGITS | CHARACTERS | expression);


//functions
voidOrType: VOID | type;
function: voidOrType? ID arguments functionBody;
//فصلت هالقد مشان قصة الفواصل وين لازم تنحط ووين لا وتركت فراغ مشان اذا ما حط ولا ارغيومنت
arguments: '(' (positionalNamed | positional | named | ) ')';
positional: positionalArguments+;
named: namedArguments+;
positionalNamed: (positionalArguments',')+ namedArguments+;
positionalArguments: (argument',')* argument;
namedArguments: '{' (REQUIRED? argument',')* REQUIRED? argument '}';
argument: type? ID;
functionBody: '{' statements* returnStatement '}';
returnStatement: RETURN (ID | CHARACTERS | DIGITS | expression | condition)* ';';


//للتيست بس مو كاملين ابدا هدول
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
FOREACH: 'foreach';

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
LATE: 'late';
REQUIRED: '@required';

//OOP
CLASS: 'class';
EXTENDS: 'extends';
INTERFACE: 'interface';
IMPLEMENTS: 'implements';
ABSTRACT: 'abstract';

//COMMENTS AND WHITE SPACES
WS: ('\r'?'\n' | '\n' | ' ' | '\t')+ -> skip;
COMMENT: '//' ~[\r\n] -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;

//GENERAL
ID: '_'?[a-zA-Z]+[0-9]*;
DIGITS: '-' ? ( '0' | '0.'[0-9]+ | [1-9]+[0-9]* ('.'[0-9]+)? );
CHARACTERS: '\''[a-zA-Z0-9!@#$%^&*+_:,.\-=]*'\'';