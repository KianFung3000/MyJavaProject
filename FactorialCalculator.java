import java.util.Scanner;

public class FactorialCalculator {
    // Method to calculate factorial
    public static int calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i; // Multiply factorial by current number
        }
    return factorial;
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial :");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is " + result);
        }
        input.close();
    }
}