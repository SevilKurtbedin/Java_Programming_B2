package Day_12_new_topic_switch;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        double price = 0;
        int calories = 0;
        boolean isValid = true;
        Scanner input = new Scanner(System.in);
        System.out.print("What size of drink do you want?: ");
        String size = input.next();

        switch (size) {
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grand":
                price = 4.00;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("We doesn't have this size");
                isValid = false;
        }
        if (isValid) {
            System.out.println("You order for a " + size + " cofee is price $" + price + " and has " + calories + " calories.");
        }
    }
}
