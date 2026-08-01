import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.print("Enter your choice: ");

        switch (sc.nextInt()) {

            case 1:
                System.out.println("Result = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Result = " + (num1 * num2));
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    System.out.println("Result = " + (num1 / num2));
                }
                break;

            case 5:
                if (num2 == 0) {
                    System.out.println("Modulus by zero is not allowed.");
                } else {
                    System.out.println("Result = " + (num1 % num2));
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}