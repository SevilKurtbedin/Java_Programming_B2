package Day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList <Integer> original = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 12, 9, 143, 4, 7, 8, 2));
        ArrayList <Integer> numbers = new ArrayList<>(original);
        System.out.println("Before remove: " + original);
        numbers.removeIf(each -> each % 2 == 0);
        for (Integer each : numbers) {
        }
        System.out.println("After remove: " + numbers); // 5, 9, 143, 7

        ArrayList <Integer> numbers2 = new ArrayList<>(original);
        numbers2.removeIf(each -> each > 10);
        System.out.println("After remove 2: " + numbers2);
    }
}
