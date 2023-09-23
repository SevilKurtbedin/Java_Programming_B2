package Day_12_new_topic_switch;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter yo browser: ");
        String browser = input.nextLine();
        System.out.print("Enter your URL: ");
        String url = input.nextLine();

        switch (browser) {
            case "Chrome":
                System.out.println("Opening " + url + " in the " + browser + " browser.");
                System.out.println("Loading...."); // https://www.google.com.af/chrome/
                break;
            case "Edge":
                System.out.println("Opening " + url + " in the " + browser + " browser.");
                System.out.println("Loading...."); // https://www.microsoft.com/en-us/
                break;
            case "Safari":
            case "safari":
            case "SAFARI":
            case "SaFaRi":
                System.out.println("Opening " + url + " in the " + browser + " browser.");
                System.out.println("Loading...."); // https://www.apple.com/safari/
                break;
            default:
                System.out.println(browser + "is not a valid browser");
        }
    }
}
