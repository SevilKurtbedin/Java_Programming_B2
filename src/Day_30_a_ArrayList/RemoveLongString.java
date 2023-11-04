package Day_30_a_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static ArrayList <String>  removeLong (ArrayList <String> list, int num) {
        ArrayList <String> updatedList = new ArrayList<>(list);
        updatedList.removeIf(each -> each.length() >= num);
        return updatedList;
    }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println("Original: " + list);
        System.out.println("After update: " + removeLong(list, 4));
    }
}
