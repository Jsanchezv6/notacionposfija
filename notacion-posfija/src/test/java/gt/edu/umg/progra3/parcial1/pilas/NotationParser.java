package gt.edu.umg.progra3.parcial1.pilas;

import java.util.Stack;
import static org.junit.Assert.*;

public class NotationParser {

    public Pila pila;

    public NotationParser(Pila pila) {
        this.pila = pila;
    }

    public String posFixToInfix(String expression){
        String[] fichas = expression.split(" ");
        Stack<String> stack = new Stack<>();

        for (String ficha : fichas) {
            if (ficha.matches("\\d+")) { 
                stack.push(ficha);
            } else { 
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String infixExpr = "" + operand1 + " " + ficha + " " + operand2 + "";
                stack.push(infixExpr);
            }
        }

        return stack.pop();
    }

}
