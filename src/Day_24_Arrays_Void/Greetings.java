package Day_24_Arrays_Void;

import java.util.Scanner;

public class Greetings {

    public static void hello(String name){
        System.out.println("hello " + name + " , how are you");
    }

    public static void main(String[] args) {

        hello("James");
        hello("Jamie");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        hello(name);

        // hello(input.nextLine());

    }

}
