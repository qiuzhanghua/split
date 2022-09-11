grammar BeijingCode;

@header {
package antlr.taiji;
}

cc: url? TEXT;
url: 'http://' | 'https://' TEXT '?'?;
TEXT: ~[?\n\r"]+;
