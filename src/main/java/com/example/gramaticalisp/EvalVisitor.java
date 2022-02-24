package com.example.gramaticalisp;

public class EvalVisitor extends OperacionesBaseVisitor<Double> {
    public String result = "";

    @Override
    public Double visitPrintOper(OperacionesParser.PrintOperContext ctx) {
        double val = visit(ctx.oper());
        if ( val % 1 != 0 )
            result += visit(ctx.oper()) + "\n";
        else
            result += (int) val + "\n";
        return 0.0;
    }

    @Override
    public Double visitOp(OperacionesParser.OpContext ctx) {
        double left = visit(ctx.oper(0));
        double right = visit(ctx.oper(1));

        return switch (ctx.sig.getType()) {
            case OperacionesParser.SUM -> left + right;
            case OperacionesParser.RES -> left - right;
            case OperacionesParser.MUL -> left * right;
            default -> left / right;
        };
    }

    @Override
    public Double visitInt(OperacionesParser.IntContext ctx) {
        return Double.valueOf(ctx.INT().getText());
    }

    @Override
    public Double visitFloat(OperacionesParser.FloatContext ctx) {
        return Double.valueOf(ctx.FLOAT().getText());
    }
}
