package Day_26_Methods;

import java.util.Arrays;

public class MinNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, -10, 56, 87, 45};

    }
    public static int minInArray1 (int [] arr) {
        Arrays.sort(arr);
        return arr [0];
    }
    public static int minInArray2 (int [] arr) {
        int min = arr [0];
        for (int eachElement : arr) {
            if (eachElement < min) {
                min = eachElement;
            }
        }
        return min;
    }
}