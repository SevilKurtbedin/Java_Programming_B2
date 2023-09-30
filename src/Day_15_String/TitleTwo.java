package Day_15_String;

import java.util.Locale;
import java.util.Scanner;

public class TitleTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name with title: ");
        String title = input.nextLine().toLowerCase();

        if (title.startsWith("mr") || title.startsWith("Mister")) {
            System.out.println("Hello Sir");
        } else if (title.startsWith("mrs") || title.startsWith("Miss") || title.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        } else if (title.startsWith("dr") || title.startsWith("Doctor")) {
            System.out.println("Hello Doctor");
        } else {
            System.out.println("There is not title!");
        }

        if (title.endsWith(" sr")) {
            System.out.println("Nice to meet you Senior");
        } else if (title.endsWith(" jr")) {
            System.out.println("Nice to meet you Junior");
        } else {
            System.out.println("No Senior and Junior");
        }
    }
}