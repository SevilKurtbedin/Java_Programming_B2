package Day_21_Arrays;

import java.util.*;
import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        //                      0         1          2        3       4       5       6        7          8            9        10           11
        System.out.println(month.length); // 12
        System.out.println(Arrays.toString(month)); // [ all months ];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number that represents the month: ");
        int userNumber = input.nextInt();

        if (userNumber >= 1 && userNumber <= 12) {
            System.out.println(month[userNumber - 1]);
        } else {
            System.out.println("Sorry, invalid input");
        }
    }
}
