package com.drpicox.tddCalculator.helper;

public class CalculatorValidatorError extends Error {

    private String expressionWithDot;
    private String description;

    public CalculatorValidatorError(String expression, int expressionIndex, String message) {
        super(deriveMessage(expression, expressionIndex, message));
        this.expressionWithDot = deriveDot(expression, expressionIndex);
        this.description = message;
    }

    public CalculatorValidatorError(String expression, int expressionIndex, Throwable cause) {
        super(deriveMessage(expression, expressionIndex, cause.getMessage()), cause);
        this.expressionWithDot = deriveDot(expression, expressionIndex);
        this.description = cause.getMessage();
    }

    public String getExpressionWithDot() {
        return expressionWithDot;
    }

    public String getDescription() {
        return description;
    }

    private static String deriveMessage(String expression, int expressionIndex, String message) {
        return deriveDot(expression, expressionIndex) + " => " + message;
    }

    private static String deriveDot(String expression, int expressionIndex) {
        String pre = expression.substring(0, expressionIndex);
        String post = expression.substring(expressionIndex);

        return pre + "·" + post;
    }
}
