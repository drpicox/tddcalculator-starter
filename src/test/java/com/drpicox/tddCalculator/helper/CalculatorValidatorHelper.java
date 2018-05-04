package com.drpicox.tddCalculator.helper;

import com.drpicox.tddCalculator.Calculator;

// DO NOT CHANGE THIS FILE
public class CalculatorValidatorHelper {

    public void validate(Calculator calculator, String expression) {
        for (int expressionIndex = 0; expressionIndex < expression.length(); expressionIndex++) {
            try {
                char currentChar = expression.charAt(expressionIndex);
                switch (currentChar) {
                    case ' ':
                        break;
                    case '[':
                        expressionIndex = validateGet(calculator, expression, expressionIndex);
                        break;
                    default:
                        calculator.input(currentChar);
                }
            } catch (Throwable th) {
                if (th instanceof CalculatorValidatorError) throw th;
                throw new CalculatorValidatorError(expression, expressionIndex, th);
            }
        }
    }


    private int validateGet(Calculator calculator, String expression, int expressionIndex) {
        int endIndex = expression.indexOf(']', expressionIndex + 1);
        String number = expression.substring(expressionIndex + 1, endIndex);

        int expected = Integer.parseInt(number);
        int displayedNumber = calculator.getDisplay();
        if (expected != displayedNumber) {
            throw new CalculatorValidatorError(expression, expressionIndex,
            "Expected [" + expected + "] but getDisplay is [" + displayedNumber + "]"
            );
        }

        return endIndex;
    }
}
