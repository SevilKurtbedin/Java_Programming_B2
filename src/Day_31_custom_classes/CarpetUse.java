package Day_31_custom_classes;

import java.util.Scanner;

public class CarpetUse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Is Persian carpet or not? (true/false): ");
        boolean isPersian = input.nextBoolean();
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        System.out.print("Enter length: ");
        double length = input.nextDouble();
        System.out.print("Enter util price: ");
        double utilPrice = input.nextDouble();
        Carpet carpet1 = new Carpet(isPersian, width, length, utilPrice);
        carpet1.calculatePrice();
        System.out.println(carpet1);


        Carpet carpet2 = new Carpet(isPersian, width, length, utilPrice);
        carpet2.calculatePrice();
        System.out.println(carpet2);
    }
}
