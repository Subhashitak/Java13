import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;
        
        while (continueCalculation) {
            // Prompt user for two numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            // Prompt user for the operation
            System.out.print("Enter operation (+, -, *, /): ");
            String operation = scanner.next();
            
            // Perform the operation and display result
            double result = 0;
            
            switch (operation) {
                case "+":
                    result = add(num1, num2);
                    System.out.println(result);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    System.out.println(result);

                    break;
                case "*":
                    result = multiply(num1, num2);
                    System.out.println(result);

                    break;
                case "/":
                    if (num2 != 0) {
                        result = divide(num1, num2);
                        System.out.println(result);

                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please select +, -, *, or /.");
            }
            
            
            
            // Prompt user to continue or exit
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("yes")) {
                continueCalculation = false;
            }
        }
        
        // Close the scanner
        scanner.close();
    }

    // Method for addition
    private static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    private static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    private static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    private static double divide(double a, double b) {
        return a / b;
    }
}
