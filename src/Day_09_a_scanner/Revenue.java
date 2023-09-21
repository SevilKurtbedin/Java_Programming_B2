package Day_09_a_scanner;

import java.util.Locale;
import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price: $");
        double price = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        double revenue = price * quantity;

        System.out.println("Revenue: $" + revenue);

    }
}
