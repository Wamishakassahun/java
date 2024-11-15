import java.util.Scanner;

public class simplecalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator"); // Use println for new line

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Select operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // Read only first character

        double result;
        switch (operator) {
            case '+':
                result = add(num1, num2);
                System.out.println("result: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = subtract(num1, num2); // Use descriptive method name
                System.out.println("result: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = multiply(num1, num2); // Use descriptive method name
                System.out.println("result: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    result = divide(num1, num2); // Use descriptive method name
                    System.out.println("result: " + num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

        scanner.close();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}