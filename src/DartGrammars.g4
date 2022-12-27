grammar DartGrammars;

// to be changed
start: (class | function)+;

//RULES
block: '{' statements* '}';
statements: statement+ ;
statement: ifStatement
         | switchStatement
         | whileStatement
         | doWhileStatement
         | forStatement
         | foreachStatement
         | declaration';'
         | assignment';'
         | function
         | functionCall';'
         ;

condition: TRUE | FALSE | comparison;
comparison: ID ('<' | '<=' | '>' | '>=' | '==' | '!=') ID
          | ID ('<' | '<=' | '>' | '>=' | '==' | '!=') expression
          | ID ('==' | '!=') CHARACTERS
          ;


//conditions process
ifStatement: IF '(' condition ')' block (elseIfStatement* elseStatement)*;
elseIfStatement: ELSE IF '(' condition ')' block;
elseStatement: ELSE block;

switchStatement: SWITCH'('ID')' switchBody;
switchBody: '{' cases '}';
cases: case+ defaultCase;
case: (CASE DIGITS | CASE CHARACTERS)':' caseBody;
defaultCase: DEFAULT':' caseBody;
caseBody: statements* BREAK';';


//loops
whileStatement: WHILE '(' condition ')' block;

doWhileStatement: DO block WHILE '(' condition ');';

forStatement: FOR '(' initialCondition ';' condition ';' increment')' block;
initialCondition: type? assignment;
increment: assignment;

foreachStatement: FOREACH '(' varOrType ID 'in' ID ')' block;


//variables
type: INT | DOUBLE | STRING | LIST | DYNAMIC | BOOL | OBJECT | FUNCTION;
varOrType: VAR | type;
declaration: LATE? FINAL type? ID initialization?
           | CONST type? ID initialization
           | LATE? varOrType ID initialization?
           ;
initialization: '=' (ID | CHARACTERS | unnamedFunction | functionCall | object | expression | list);
assignment: ID '=' (ID | CHARACTERS | unnamedFunction | functionCall | object | expression | list);
list: '[' ((ID | CHARACTERS | expression | object | list | functionCall | unnamedFunction)',')* ']';

//functions
voidOrType: VOID | type;
signature: voidOrType? ID arguments;
function: signature (ASYNC | ASYNC_STAR)? functionBody;
unnamedFunction: arguments (ASYNC | ASYNC_STAR)? functionBody;
//فصلت هالقد مشان قصة الفواصل وين لازم تنحط ووين لا وتركت فراغ مشان اذا ما حط ولا ارغيومنت
arguments: '(' (positionalNamedArguments | positionalArguments | namedArguments | ) ')';
positionalNamedArguments: (positionalArguments',')+ namedArguments+;
positionalArguments: (arg',')* arg;
namedArguments: '{' (REQUIRED? arg',')* REQUIRED? arg '}';
arg: type? ID;
functionBody: '{' statements* returnStatement? '}';
returnStatement: RETURN (ID | CHARACTERS | expression | object | list | functionCall | unnamedFunction | condition)? ';';


//classes
class: ABSTRACT? CLASS ID (EXTENDS ID)? (IMPLEMENTS ID)? classBody;
classBody:'{' (attribute | method)* defaultConstructer? (attribute | method)* '}';
attribute: (STATIC? declaration';');
method: OVERRIDE? signature methodBody
      | STATIC signature methodBody
      | signature';'
      | namedConstructer
      ;
methodBody: '{' (statements | thisStatement';')* '}';
thisStatement: THIS'.'ID '=' (ID | CHARACTERS | expression | object | list | functionCall | unnamedFunction);
defaultConstructer: ID '(' consArguments ( ');' | ')' methodBody );
namedConstructer: ID'.'ID '(' consArguments ( ');' | ')' methodBody);
consArguments: (consPositionalNamedArguments | consPositionalArguments | consNamedArguments | );
consPositionalNamedArguments: (consPositionalArguments',')+ consNamedArguments+;
consPositionalArguments: (consArg',')* consArg;
consNamedArguments: '{' (REQUIRED? consArg',')* REQUIRED? consArg '}';
consArg: (type? ID) | (THIS'.'ID);


//function calls and objects
functionCall: AWAIT? ID '(' parameters ')';
object: NEW ID '(' parameters ')'
      | component
      ;
parameters: (positionalNamedParameters | positionalParameters | namedParameters | );
positionalNamedParameters: (positionalParameters',')+ namedParameters+;
positionalParameters: (parameter',')* parameter;
namedParameters: (ID':'parameter',')* ID':'parameter;
parameter: ID | CHARACTERS | expression | object | list | functionCall | unnamedFunction;


//expressions
expression: expression '*' expression
          | expression '/' expression
          | expression '+' expression
          | expression '-' expression
          | ID
          | DIGITS
          ;


///////////////////////////FLUTTER///////////////////////////
component: materialApp
         | scaffold
         | column
         | row
         | stack
         | text
         | container
         | inkWell
         | image
         | button
         ;

materialApp: NEW MATERIAL_APP '(' materialAppAtts ')' ;
materialAppAtts: (TITLE':'CHARACTERS',')? (HOME':'object',')? ;

scaffold: NEW SCAFFOLD '(' scaffoldAtts ')' ;
scaffoldAtts: (BACKGROUND_COLOR':'COLORS',')? (BODY':'object',')? ;

column: NEW COLUMN '(' column_rowAtts ')' ;
row: NEW ROW '(' column_rowAtts ')' ;
column_rowAtts: (MAIN_AXIS_ALIGNMENT':'ALIGNMENT',')? (CROSS_AXIS_ALIGNMENT':'ALIGNMENT',')? (CHILDREN':'list',')? ;

stack: NEW STACK '(' stackAtts ')' ;
stackAtts: (FIT':'STACK_FIT',')? (CHILDREN':'list',')? ;

text: NEW TEXT '(' CHARACTERS',' textAtts ')' ;
textAtts: (COLOR':'COLORS',')? (SIZE':'DIGITS)? (STYLE':'STYLES)?;

container: NEW CONTAINER '(' containerAtts ')' ;
containerAtts: (WIDTH':'DIGITS',')? (HEIGHT':'DIGITS',')? (CHILD':'object)? ;

inkWell: NEW INK_WELL '(' inkWellAtts ')' ;
inkWellAtts: (ON_TAP':'(functionCall | unnamedFunction)',') (CHILD':'object)? ;

image: NEW IMAGE '(' CHARACTERS',' imageAtts ')' ;
imageAtts: (FIT':'BOX_FIT',')? ;

button: NEW BUTTON '(' buttonAtts ')' ;
buttonAtts: (ACTION':'(functionCall | unnamedFunction)',')? (CHILD':'text',')? (COLOR':'COLORS',')? ;




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
FUNCTION: 'Function';
RETURN: 'return';
LATE: 'late';
REQUIRED: 'required';
ASYNC: 'async';
ASYNC_STAR: 'async*';
AWAIT: 'await';

//OOP
CLASS: 'class';
EXTENDS: 'extends';
INTERFACE: 'interface';
IMPLEMENTS: 'implements';
ABSTRACT: 'abstract';
OVERRIDE: '@override';
THIS: 'this';
STATIC: 'static';
NEW: 'new';

//COMMENTS AND WHITE SPACES
WS: ('\r'?'\n' | '\n' | ' ' | '\t')+ -> skip;
COMMENT: '//' ~[\r\n] -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;

//COMPONENTS
MATERIAL_APP: 'MaterialApp';
TITLE: 'title';
HOME: 'home';
/////////////
SCAFFOLD: 'Scaffold';
BODY: 'body';
BACKGROUND_COLOR: 'backgroundColor';
/////////////
COLUMN: 'Column';
ROW: 'Row';
MAIN_AXIS_ALIGNMENT: 'mainAxisAlignment';
CROSS_AXIS_ALIGNMENT: 'crossAxisAlignment';
CHILDREN: 'children';
/////////////
TEXT: 'Text';
COLOR: 'color';
SIZE: 'size';
STYLE: 'style';
/////////////
CONTAINER: 'Container';
WIDTH: 'width';
HEIGHT: 'height';
CHILD: 'child';
/////////////
INK_WELL: 'InkWell';
ON_TAP: 'onTap';
/////////////
IMAGE: 'Image';
FIT: 'fit';
/////////////
STACK: 'Stack';
/////////////
BUTTON: 'Button';
ACTION: 'action';
/////////////
COLORS: 'Purple' | 'Blue' | 'Yellow' | 'Black' | 'White' | 'Green' | 'Red';
STYLES: 'Italic' | 'Bold' | 'BoldItalic';
BOX_FIT: 'BoxFit.cover' | 'BoxFit.fill' | 'BoxFit.fitWidth' | 'BoxFit.fitHeight';
STACK_FIT: 'StackFit.expand' | 'StackFit.loose';
ALIGNMENT: 'start' | 'center' | 'end' | 'spaceBetween' | 'spaceEvenly' | 'spaceAround';

//GENERAL
ID: '_'?[a-zA-Z]+[0-9]*;
DIGITS: '-' ? ( '0' | '0.'[0-9]+ | [1-9]+[0-9]* ('.'[0-9]+)? );
CHARACTERS: '\''[a-zA-Z0-9!@#$%^&*+_:,.\-=]*'\'';