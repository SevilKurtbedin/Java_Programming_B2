package Day_21_Arrays;

public class AverageNumber {
    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 12, 45, 67, 87, 23, 34, 87, 34};
        int sum = 0;
        // Need to loop through get each element and sum up all;
        // Then sum up all;
        for (int each : arr) {
            sum += each;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum/arr.length));

        int sum2 = 0;

        for (int i = 0; arr.length > i; i++) {
            sum2 += arr [i];
        }
        System.out.println("Sum 2: " + sum2);
        System.out.println("Average 2: " + (sum2/arr.length));
    }
}
