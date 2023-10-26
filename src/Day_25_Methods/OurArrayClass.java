package Day_25_Methods;

import java.util.Arrays;

public class OurArrayClass {
    public static void firstElement (int [] num) {
        System.out.println("First Element: " + num[0]);
    }
    public static void lastElement (int [] num) {
        System.out.println("Last Element: " + num[num.length - 1]);
    }
    public static void printArray (int [] num) {
        System.out.println(Arrays.toString(num));
    }
    public static void printMiddle (int [] num) {
        if (num.length % 2 == 0) {
            System.out.println("First Middle: " + num [num.length / 2 - 1]);
            System.out.println("Second Middle: " + num [num.length / 2]);
        } else {
            System.out.println("Middle: " + num [num.length / 2]);
        }
    }

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        firstElement(numbers);
        lastElement(numbers);
        printArray(numbers);
        printMiddle(numbers);

        int [] n = new int[] {1, 2, 34, 6};
        System.out.println();
        firstElement(n);
    }
}
