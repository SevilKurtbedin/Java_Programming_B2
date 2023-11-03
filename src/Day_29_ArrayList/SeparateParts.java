package Day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
public class SeparateParts {
    public static void main(String[] args) {

        String s = "ABCD123!@#$%^&456EFG";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(list);

        ArrayList<String> numbers = new ArrayList<>(list);
        numbers.retainAll(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        System.out.println(numbers);

        ArrayList<String> special = new ArrayList<>(list);
        special.retainAll(Arrays.asList("!", "@", "#", "$", "%", "^", "&"));
        System.out.println(special);

        ArrayList<String> letters = new ArrayList<>(list);
        letters.retainAll(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
        System.out.println(letters);
    }
}
