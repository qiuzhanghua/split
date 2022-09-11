package cn.com.taiji;

import antlr.taiji.BeijingCodeLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.junit.jupiter.api.Test;
import java.util.List;

class AppTest {

    @Test
    void stringsTest() {
        String content = "";
        hello.HelloLexer lexer;
        List<Token> list;
        content = "a\\bc|\\||xyz|1\\|23||";
        lexer = new hello.HelloLexer(CharStreams.fromString(content));
        list = (List<Token>) lexer.getAllTokens();
        list.forEach(item -> System.out.println(item.getText()));
    }

    @Test
    void beijingCodeTest() {
        System.out.println("========================");
        String str;
        List<Token> list;
        BeijingCodeLexer lexer;
        str = "https://abc.com/?xyz";
        lexer = new BeijingCodeLexer(CharStreams.fromString(str));
        list = (List<Token>) lexer.getAllTokens();
        list.forEach(item -> System.out.println(item.getText()));
        System.out.println("========================");
        str = "abc.123";
        lexer = new BeijingCodeLexer(CharStreams.fromString(str));
        list = (List<Token>) lexer.getAllTokens();
        list.forEach(item -> System.out.printf("%s\n", item.getText()));
        System.out.println("========================");

    }
}
