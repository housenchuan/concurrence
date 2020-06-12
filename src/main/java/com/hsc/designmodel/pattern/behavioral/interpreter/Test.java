package com.hsc.designmodel.pattern.behavioral.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        String inputStr = "100 * 2 + 400 * 1 + 66";
        ExpressionParser spelExpressionParser = new SpelExpressionParser();
        Expression expression = spelExpressionParser.parseExpression(inputStr);
        Object value = expression.getValue();
        System.out.println(value);
    }
}
