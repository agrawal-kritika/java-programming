
/* Arithmetic operators: +, -, *, /, %
	Take 2 variables: number1 = 50.79 and number2 = 15 and perform arithmetic operations
*/

class arithmeticOperators {
    public static void main(String[] args) {
        float number1 = 50.79f;
        int number2 = 15;
        float sum, diff, mul, div, rem; // creating variables to store the values
        sum = number1 + number2;
        diff = number1 - number2;
        mul = number1 * number2;
        div = number1 / number2;
        rem = number1 % number2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Remainder: " + rem);
    }
}
