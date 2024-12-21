public class ArraySum {
  public static void main(String[] args) {
    int [] numbers = {5, 10, 15, 20};

    int sum = 0;
    for (int num : numbers) { // Enhanced for-loop
        sum += num;
    }
    System.out.println("The sum of array elements is: " + sum);
  }   
}
