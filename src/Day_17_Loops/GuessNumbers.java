package Day_17_Loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = 77;
        int guess;
        do {

            System.out.print("Guess a number from 1 - 100: ");
            guess = input.nextInt();
            if (guess > secretNumber) {
                System.out.println(guess + " is too high. Try again!");
            } else {
                System.out.println(guess + " is too low. Try again!");
            }

        } while (guess != secretNumber);
        System.out.println("You guess is correct!");
    }
}
