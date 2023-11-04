package Day_30_a_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {
    public static ArrayList <Integer> sumFromString (ArrayList <String> list) {
        ArrayList <Integer> numSum = new ArrayList<>();
        for (String each : list) {
        int sum = 0;
        for (int i = 0; i < each.length(); i++) {
            each.charAt(i);
            sum += Integer.parseInt("" + each.charAt(i));
            }
        numSum.add(sum);
        }
        // for (String eachDigit : list.split(regex: "");
        return numSum;
    }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("123", "34", "513"));
        System.out.println(sumFromString(list));
    }
}
