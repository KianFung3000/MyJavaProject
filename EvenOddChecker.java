import java.util.Scanner;

public class EvenOddChecker {
    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0; // Returns true if even, false if odd
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        input.close();
    }
}
