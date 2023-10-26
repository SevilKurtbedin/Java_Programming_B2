package Day_25_Methods;

import java.util.Scanner;

public class Greeting {
    public static void hello (String name) {
        System.out.println("Hello " + name + ", how are you?");
    }
    public static void main(String [] args) {
        // hello(); // you can not call it like this with NOT argument, because method was NOT declared like that.
        hello("Nadir"); // argument ---> it is the data that we are passing when we are calling parameterized method.
        String nameOne = "Feyruz";
        hello(nameOne);
        hello("Diliara");
        hello("Sevil");
        // hello(10); // data type has to match what method accept as parameter;
        // hello(ture);
        System.out.println("__________________");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.next();
        hello(name);
    }
}
