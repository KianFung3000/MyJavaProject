public class LargestNumberInArray {
    public static void main(String [] args) {
        int [] numbers = {45, 2, 78, 34, 89, 21};

        int largest = numbers[0]; // Assume the first element is the largest
        for (int i = 1; i < numbers.length; i++) { // Loop through the array
        if (numbers[i] > largest) {
            largest = numbers[i]; // Update largest if a bigger number is found
        }
    }

    System.out.println("The largest number is :" + largest);
}
}