grammar Pascal;
@header {
package antlr.taiji;
}

prog: (string)*;

string
locals [int xyz]
  :  Digit {$xyz = (int)($Digit.text).charAt(0);} ({$xyz > 0}? any {$xyz--;})*
  ;

any
  :
  Other
  ;

Digit
  :  .
  ;

Other
  :  .
  ;