package Day_12_new_topic_switch;

import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n == 1) {
            System.out.println("One");
        } else if (n == 2) {
            System.out.println("Two");
        } else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("Four");
        } else if (n == 5) {
            System.out.println("Five");
        } else if (n == 6) {
            System.out.println("Six");
        } else {
            System.out.println("Invalid number!");
        }
        System.out.println("____________");

        switch (n) { // char, byte, short, int, String | It will not work with boolean expression.
            case 1: // in if statements: ---> if (n == 1) {
                System.out.println("One");
                break;
            case 2: // in if statements: ---> if (n == 2) {
                System.out.println("Two");
                break;
            case 3: // in if statements: ---> if (n == 3) {
                System.out.println("Three");
                break;
            case 4: // in if statements: ---> if (n == 4) {
                System.out.println("Four");
                break;
            case 5: // in if statements: ---> if (n == 5) {
                System.out.println("Five");
                break;
            case 6: // in if statements: ---> if (n == 1) {
                System.out.println("Six");
                break;
            default:
                System.out.println("Invalid number!");

        }
    }
}
