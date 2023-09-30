package Day_15_String;

import java.util.Locale;
import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: " );  // www.google.com
        String url = input.next().toLowerCase();
        System.out.print("Now, enter your name with title: ");
        String name = input.next();

        // Mr,Tom
        // You entered correct URL which + $url

        if (url.startsWith("www.") && url.endsWith(".com") ) { // www --- wWw --- Www --- wwW --- WWW
            System.out.println(name + "\nYou entered correct URL which is: " + url);
        } else {
            System.out.println("Invalid URL");
        }
    }
}
