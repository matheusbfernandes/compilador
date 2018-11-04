import afd.AFD;
import analisadorLexico.JavaLexer;
import analisadorLexico.JavaParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import tabelaSimbolos.Simbolo;
import tabelaSimbolos.TabelaSimbolos;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main (String[] args) throws IOException {
        String fileName = "C:/Users/Matheus/Documents/Teste.java";

        JavaLexer scanner = new JavaLexer(CharStreams.fromFileName(fileName));
        CommonTokenStream allTokensGenerated = new CommonTokenStream(scanner);
        allTokensGenerated.fill();
        JavaParser parser = new JavaParser(allTokensGenerated);
        ParseTree tree = parser.compilationUnit();


//        List<Token> listaTokens = allTokensGenerated.getTokens();
//
//        System.out.println("+============Lista de Lexemas============+");
//        System.out.format("|%-16s |%-6s |%-6s |%-6s|%n","LEXEMA", "TIPO", "LINHA", "COLUNA");
//        System.out.println("|-----------------|-------|-------|------|");
//        for (Token t : listaTokens) {
//            if (t.getType() == 108) {
//                System.out.format("|Token '%s' nao reconhecido na linha: %d:%d|%n", t.getText(), t.getLine(), t.getCharPositionInLine());
//            }
//            else {
//                if (t.getType() == 51) {
//                    TabelaSimbolos.getInstancia().addSimbolo(new Simbolo(t.getText(), t.getType()));
//                }
//
//                System.out.format("|%-16s |%-6d |%-6d |%-6d|%n", t.getText(), t.getType(), t.getLine(), t.getCharPositionInLine());
//            }
//        }
//        System.out.println("+========================================+");
//        System.out.println();
//
//        System.out.print(TabelaSimbolos.getInstancia().toString());
//
//        AFD afd = new AFD(listaTokens, "pdf");
    }
}
