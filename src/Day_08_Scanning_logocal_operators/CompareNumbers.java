package Day_08_Scanning_logocal_operators;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt(); // we are getting something from user it into a container/variable
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();

        System.out.println("Numbers are equal? " + (num1 == num2));

    }
}
