package Day_15_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = input.next();
        System.out.print("Enter last name: ");
        String lastName = input.next();

        String initials = "" + firstName.charAt(0) + lastName.charAt(0); // the chars 'J' + 'B' ---> num + num

        // You can apply .toUpperCase here as well;

        System.out.println("Your initial: " + initials.toUpperCase());
    }
}
