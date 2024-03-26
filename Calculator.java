import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Display a welcome message
        System.out.println("Welcome to the Simple Calculator");
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble(); // Read the first number
        
        // Prompt the user to enter the operator (+, -, *, /)
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // Read the operator
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble(); // Read the second number
        
        double result; // Variable to store the result of the calculation
        
        // Perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2; // Addition
                break;
            case '-':
                result = num1 - num2; // Subtraction
                break;
            case '*':
                result = num1 * num2; // Multiplication
                break;
            case '/':
                // Check if the second number is not zero to avoid division by zero error
                if (num2 != 0) {
                    result = num1 / num2; // Division
                } else {
                    // Display an error message if the second number is zero
                    System.out.println("Error: Division by zero!");
                    return; // Exit the program
                }
                break;
            default:
                // Display an error message if the operator is invalid
                System.out.println("Error: Invalid operator!");
                return; // Exit the program
        }
        
        // Display the result of the calculation
        System.out.println("Result: " + result);
    }
}
