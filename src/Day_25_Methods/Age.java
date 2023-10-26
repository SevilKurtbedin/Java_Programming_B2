package Day_25_Methods;
/*
    make a method that calculates and prints it;
    take the birth year as parameter;
 */

import java.util.Scanner;

public class Age {
    public static void getAge (int year) {
        if (year > 2023) {
            System.out.println("You have born yet");
        } else {
            System.out.println("Your age is " + (2023 - year));
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you birth year: ");
        int birthYear = input.nextInt();
        getAge(birthYear);
    }
}
/*
    how to count the cows?
    Calculator
 */
