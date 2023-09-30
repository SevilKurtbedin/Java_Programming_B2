package Day_15_String;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your URL: ");
        String url = input.next(); // www.gmail.com
        //                            0123456789.10.11.12
        System.out.println(url.length());
        String result = "" + url.charAt(4) + url.charAt(5) + url.charAt(6) + url.charAt(7) + url.charAt(8) + url.charAt(9);
        System.out.println(result);

        // .substring(startsIndex);
        // .substring(endsIndex, endIndex);
        int startPoint = url.indexOf(".") + 1;
        System.out.println(startPoint);
        System.out.println(url.substring((startPoint)));

        int endPoint = url.length() - 4;
        System.out.println(url.substring(startPoint, endPoint));


    }
}
