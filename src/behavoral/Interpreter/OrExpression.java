/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavoral.Interpreter;

/**
 *
 * @author marc
 */
public class OrExpression implements Expression {

    private Expression exp1 = null;
    private Expression exp2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.exp1 = expr1;
        this.exp2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) || exp2.interpret(context);
    }

}
