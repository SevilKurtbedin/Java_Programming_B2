package Day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(3, 6, 2, 22, 230, 12));
        System.out.println("Original: " + list);

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        System.out.println("_________________________");

        ArrayList <Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println(letters); // [D, C, B, A]
        System.out.println(Collections.max(list)); // 230
        System.out.println(Collections.min(list)); // 2

        System.out.println("_________________________");
        Collections.swap(letters, 0, 3);
        System.out.println(letters);

        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(11, 11, 2, 34, 5, 7, 11));
        System.out.println(Collections.frequency(numbers, 11)); // 3
    }
}
