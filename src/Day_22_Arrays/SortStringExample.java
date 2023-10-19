package Day_22_Arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String [] arr = {"java", "api", "Selenium", "12", "dabase", "Apple", "-"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // started from special characters , after numbers alphabet from Upper, and after alphabet from to Lower;
        // +, -, $ .... 1, 2, 3 .... A, B, C .... a, b, c;
    }
}
