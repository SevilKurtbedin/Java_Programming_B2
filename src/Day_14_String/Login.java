package Day_14_String;

import java.util.Locale;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String userName = input.next();
        userName = userName.toLowerCase(Locale.ROOT); // I made my username to lowercase: all letters will be small;
        System.out.print("Enter your password: ");
        String password = input.next();
        String actualPasswordInDB = "loopcamp2023";
        /*
            if condition - length bigger than 8 and password match;
                _________
            else
                _________
         */
        System.out.println("_________________");
        if (password.length() > 8 && password.equals(actualPasswordInDB)) {
            System.out.println("You are login in.");
        } else {
            System.out.println("Invalid password");
        }

        if (userName.equals("Sevil") && password.length() > 8 && password.equals(actualPasswordInDB)) {
            System.out.println("You are login in");
        } else {
            if (!userName.equals("Sevil")) {
                System.out.println("User name is invalid!");
            } else {
                System.out.println("Invalid password!");
            }
        }
    }
}
