package Day_21_Arrays;

import java.util.*;
import java.util.Scanner;

public class SelectWeekDay {
    public static void main(String[] args) {

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //                        0          1         2           3           4           5          6
        System.out.println(weekDays.length); // 12
        System.out.println(Arrays.toString(weekDays)); // [ all months ];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number that represents the month: ");
        int userNumber = input.nextInt();

        if (userNumber >= 1 && userNumber <= 7) {
            System.out.println(weekDays[userNumber - 1]);
        } else {
            System.out.println("Sorry, invalid input");
        }
    }
}