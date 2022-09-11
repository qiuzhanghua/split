grammar Hello;

@header {
package hello;
}

code : field ('|' field)*;
field
    : TEXT
    | STRING
    |
    ;

TEXT: ~[|"]+;
STRING:  ('\\|'|~'|')+;