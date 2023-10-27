package my_utilites;

public class ArrayUtil {
    /**
     * This method calculate summary Arrays numbers what we write in input.
     * @return Summary of all numbers.
     */
    public static int sumOfArray (int [] arr) {
        int sum = 0;
        for (int eachNum : arr) {
            sum += eachNum;
        }
        return sum;
    }
    public static int maxInArray (int [] arr) {
        int max = arr [0];
        for (int eachElement : arr) {
            if (eachElement > max) {
                max = eachElement;
            }
        }
        return max;
    }
    /**
     * This method accepts an int array and an int numb
     * Then check if the number is in the array
     * If yes, return true, otherwise return false
     */
    public static boolean containsInArray (int [] arr, int num) {
        for (int eachElement : arr) {
            if (eachElement == num) {
                return true;
            }
        }
        return false;
    }
}
