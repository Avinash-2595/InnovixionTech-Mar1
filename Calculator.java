import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 - num2);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1 * num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1 / num2);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }

        scanner.close();
    }
}