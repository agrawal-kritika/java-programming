// Relational Operators: <, >, <=, >=, !=, == 

import java.util.Scanner; // Importing Scanner class for user input

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creating a Scanner object to read input

        // Declaring variables
        int num1, num2;

        // Taking user input
        System.out.println("Enter the first number: ");
        num1 = scan.nextInt(); // Reading first number from user

        System.out.println("Enter the second number: ");
        num2 = scan.nextInt(); // Reading second number from user

        // Performing relational operations and printing the results
        System.out.println("num1 > num2: " + (num1 > num2)); // Checks if num1 is greater than num2
        System.out.println("num1 < num2: " + (num1 < num2)); // Checks if num1 is less than num2
        System.out.println("num1 >= num2: " + (num1 >= num2)); // Checks if num1 is greater than or equal to num2
        System.out.println("num1 <= num2: " + (num1 <= num2)); // Checks if num1 is less than or equal to num2
        System.out.println("num1 == num2: " + (num1 == num2)); // Checks if num1 is equal to num2
        System.out.println("num1 != num2: " + (num1 != num2)); // Checks if num1 is not equal to num2

        scan.close();
    }
}
