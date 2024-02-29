package org.example;

public enum FacialExpression {
    SHOCK,
    SURPRISE,
    BEWILDERMENT,
    ASTONISHMENT,
    AMAZEMENT;

    public static FacialExpression fromString(String expression) {
        if (expression == null) {
            throw new IllegalArgumentException("Expression cannot be null");
        }
        expression = expression.toUpperCase();
        try {
            return FacialExpression.valueOf(expression);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid facial expression: " + expression);
        } catch (NullPointerException e) {
            throw new NullPointerException("Invalid facial expression: " + expression);
        }
    }
}




