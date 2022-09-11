grammar Hello;

@header {
package hello;
}

strs : STRING*?;
STRING : '"' (ESC|.)*? '"';
//fragment
ESC : '\\\\' | '\\"';
WS: [ \t\r\n]+ -> skip;
