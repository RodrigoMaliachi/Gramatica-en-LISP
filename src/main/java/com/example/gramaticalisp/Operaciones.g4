grammar Operaciones;

prog    : stat+ ;

stat    : oper NEWLINE      #   printOper
        | NEWLINE           #   blank
        ;

oper    : '(' sig = ( SUM | RES | MUL | DIV ) oper oper ')' # op
        | value             #   val
        ;

value   : INT               #   int
        | FLOAT             #   float
        ;

SUM     : '+'               ;
RES     : '-'               ;
MUL     : '*'               ;
DIV     : '/'               ;
INT     : [0-9]+            ;
FLOAT   : [0-9]+'.'[0-9]+   ;
NEWLINE : '\r'? '\n'        ;
WS 		: [ \t]+ -> skip    ;