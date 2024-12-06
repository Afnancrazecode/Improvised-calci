import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Simple Calculator by AfnanCrazeCodeinit!");

        while (true) {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exponential");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            int choice = sc.nextInt();

            // Exit condition
            if (choice == 8) {
                System.out.println("Thank you for using the Simple Calculator. Goodbye!");
                break;
            }

            double num1 = 0, num2 = 0, result;

            // For square root, only one input is needed
            if (choice == 7) {
                System.out.print("Enter the number: ");
                num1 = sc.nextDouble();
            } else if (choice >= 1 && choice <= 6) {
                System.out.print("Enter the first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();
            } else {
                System.out.println("Invalid choice! Please choose a valid option.");
                continue;
            }

            // Perform operation based on user choice
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.printf("Result: %.2f + %.2f = %.2f\n", num1, num2, result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.printf("Result: %.2f - %.2f = %.2f\n", num1, num2, result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.printf("Result: %.2f * %.2f = %.2f\n", num1, num2, result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.printf("Result: %.2f / %.2f = %.2f\n", num1, num2, result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    result = num1 % num2;
                    System.out.printf("Result: %.2f %% %.2f = %.2f\n", num1, num2, result);
                    break;
                case 6:
                    result = Math.pow(num1, num2);
                    System.out.printf("Result: %.2f ^ %.2f = %.2f\n", num1, num2, result);
                    break;
                case 7:
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                        System.out.printf("Result: √%.2f = %.2f\n", num1, result);
                    } else {
                        System.out.println("Error: Square root of a negative number is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }

        sc.close();
    }
}
