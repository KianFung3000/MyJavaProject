public class SimpleMethodExample {
    // A method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b ; // Return the sum
    }

    public static void main(String[]args) {
        int result = addNumbers(5, 7); // Call the method and store the result
        System.out.println("The sum is: " + result); // Print the result
    }
}
