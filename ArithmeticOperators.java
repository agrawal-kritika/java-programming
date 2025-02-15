
/* Arithmetic operators: +, -, *, /, %
	Take 2 variables: number1 = 50.79 and number2 = 15 and perform arithmetic operations
*/

class arithmeticOperators {
    public static void main(String[] args) {
	// Declaring and initializing variables
        float number1 = 50.79f;  // Floating-point number
        int number2 = 15; 	 // Integer number
        float sum, diff, mul, div, rem; // Creating variables to store the results of arithmetic operations
	// Performing arithmetic operations
        sum = number1 + number2;
        diff = number1 - number2;
        mul = number1 * number2;
        div = number1 / number2;
        rem = number1 % number2;
	// Printing the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Remainder: " + rem);
    }
}
