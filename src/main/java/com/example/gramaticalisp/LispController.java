package com.example.gramaticalisp;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class LispController {
    @FXML
    private TextArea resultados;

    @FXML
    private TextArea programa;

    @FXML
    protected void onHelloButtonClick(){
        String prog = programa.getText();

        if ( !prog.endsWith("\n") )
            prog += "\n";

        ANTLRInputStream input = new ANTLRInputStream( prog );
        OperacionesLexer lexer = new OperacionesLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OperacionesParser parser = new OperacionesParser(tokens);

        //Genera el arbol de parseo
        ParseTree tree = parser.prog();

        //Muestra una ventana con el arbol
        Trees.inspect(tree,parser);

        //Evalua las expresiones del lenguaje
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);

        //Lo imprime en pantalla
        resultados.setText(String.valueOf(eval.result));
    }
}