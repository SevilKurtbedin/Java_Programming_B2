package Day_15_String;

import java.util.Scanner;

public class FirstAndLust {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();

        // Get the first character;
        System.out.println("First character: " + sentence.charAt(0));
        // Get the last character;
        System.out.println("Last character: " + sentence.charAt(sentence.length() - 1));
        // If we put one letter, he gives me this letter in start and ending;
        // If user press Enter, we get empty String which is ---> ""; That means there is nt character so there is index.


    }
}
