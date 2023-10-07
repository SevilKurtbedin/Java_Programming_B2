package Day_18_Loops;

import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        /*
            loop through all the characters
            get each character:
                - if character is uppercase ---> increase count for uppercase
                - if character is lowercase ---> increase count for lowercase
                - if character is number ---> increase count for nu,ber
         */
        Scanner word = new Scanner(System.in);
        System.out.print("Enter your word or sentence: ");
        String str = word.next();
        int countUp = 0;
        int countLo = 0;
        int countSp = 0;
        int number = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i); // get the character at the index number i;
            // if character is uppercase ---> my char >= 'A' && my char <= 'Z';
            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                countUp++;
            // if character is uppercase ---> my char >= 'a' && my char <= 'z';
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                countLo++;
            // if character is uppercase ---> my char >= '0' && my char <= '9';
            } else if (eachLetter >= '0' && eachLetter <= '9') {
                number++;
            } else {
                countSp++;
            }
        }
        System.out.println("Uppercase character count: " + countUp);
        System.out.println("Lowercase character count: " + countLo);
        System.out.println("Number character count: " + number);
        System.out.println("Special character count: " + number);

        System.out.println("___________________________________________________________");

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i); // get the character at the index number i;
            // if character is uppercase ---> my char >= 'A' && my char <= 'Z';
            if (Character.isUpperCase(str.charAt(i))) {
                countUp++;
                // if character is uppercase ---> my char >= 'a' && my char <= 'z';
            } else if (Character.isLowerCase(str.charAt(i))) {
                countLo++;
                // if character is uppercase ---> my char >= '0' && my char <= '9';
            } else if (Character.isDigit(str.charAt(i))) {
                number++;
            } else {
                countSp++;
            }
        }

        System.out.println("Uppercase character count: " + countUp);
        System.out.println("Lowercase character count: " + countLo);
        System.out.println("Number character count: " + number);
        System.out.println("Special character count: " + number);
    }
}
