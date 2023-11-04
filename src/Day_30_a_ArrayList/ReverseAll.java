package Day_30_a_ArrayList;

import my_utilites.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("Ted", "Talk", "Learn"));
        System.out.println(list);
        System.out.println(reversAll(list));
    }
    public static ArrayList <String> reversAll (ArrayList <String> list) {
        ArrayList <String> reversedList = new ArrayList<>();
        for (String each : list) {
            reversedList.add(StringUtil.reverse(each));
        }
        return reversedList;
    }
}
