import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first, second, result;
        String op;
        
    
        System.out.print("Enter first number: ");
        first = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        second = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        op = scanner.next();
        switch (op) {
            case "+":
                result = first + second;
                System.out.println(first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println(first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println(first + " * " + second + " = " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println(first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        
        scanner.close();
    }
}
