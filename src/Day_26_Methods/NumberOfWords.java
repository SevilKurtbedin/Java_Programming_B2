package Day_26_Methods;

public class NumberOfWords {
    public static String numberOfWords (int num) {
        String [] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        //                  0       1       2       3        4      5       6        7        8       9
        if (num >= 1 && num <= 10) {
            return words [num - 1];
        } else {
            return "Not valid number";
        }
    }

    public static void main(String[] args) {
        System.out.println(numberOfWords(11));
        System.out.println(numberOfWords(-1));
        System.out.println(numberOfWords(7));
    }
}
