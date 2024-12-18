import java.util.Scanner;

public class MethodWithInput {
    // A method to multiply two numbers
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number :");
        int num2 = input.nextInt();

        int result = multiplyNumbers(num1, num2);
        System.out.println("The product is: " + result);

        input.close();
    }
}
