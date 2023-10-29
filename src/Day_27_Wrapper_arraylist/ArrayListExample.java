package Day_27_Wrapper_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // All collection classes work only with object data type;
        // ArrayList <int> numbers = new ArrayList <> () --> NOT GOOD
        ArrayList <Integer> numbers = new ArrayList <> (); // in the memory, it allocated size of 10;
        //           Mandatory              Container
        System.out.println(numbers.size()); // it will be 0, because before that we do not have nothing;
        System.out.println(numbers); // it will be [], its mean Empty;
        numbers.add(7); // it will be [7]; ---> .add(?) ---> add the element to the END;
        System.out.println(numbers);
        numbers.add(-10);
        System.out.println(numbers); // [7, -10] and continue;
        System.out.println(numbers.size()); // it will be 2, because before we write two numbers;
    }
}
