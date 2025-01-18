package chapter5;

import java.util.Scanner;

public class Discussion501 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression (e.g., 2+3): ");
        String expression = scanner.nextLine();
        try {
            double result = evaluate(expression);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid expression: " + e.getMessage());
        }
    }

    public static double evaluate(String expression) {
        expression = expression.replaceAll("\\s+", "");
        if (isNumeric(expression)) {
            return Double.parseDouble(expression);
        }

        char operator = findOperator(expression);
        if (operator == '\0') {
            throw new IllegalArgumentException("Invalid operator");
        }
        int operatorIndex = expression.indexOf(operator);
        String operand1 = expression.substring(0, operatorIndex);
        String operand2 = expression.substring(operatorIndex + 1);

        double value1 = evaluate(operand1);
        double value2 = evaluate(operand2);

        switch (operator) {
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                if (value2 == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                return value1 / value2;
            default:
                throw new IllegalArgumentException("Unsupported operator");
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static char findOperator(String expression) {
        char[] operators = {'+', '-', '*', '/'};
        for (char operator : operators) {
            if (expression.indexOf(operator) != -1) {
                return operator;
            }
        }
        return '\0';
    }
}
