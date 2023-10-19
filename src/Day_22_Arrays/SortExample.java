package Day_22_Arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int [] numbers = {3, 5, 7, 3234, 8, 23, 23};
        System.out.println(Arrays.toString(numbers));

        // .sort();
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Find the max
        System.out.println(numbers[0] + " it Max");
        System.out.println(numbers[numbers.length - 1] + " it Min");
    }
}
