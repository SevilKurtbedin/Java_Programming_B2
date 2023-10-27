package Day_26_Methods;

import my_utilites.ArrayUtil;

public class SumOfElement {
    public static void main(String[] args) {
        int [] arr = {1, 5, 6, 2};
        // since I am using the method from same class, I can call it with just the method name
        System.out.println(sumOfArray(arr));
        // since I am using the method from different package,
        // I need to import the package first, then use the class name to call method which is inside of the class
        System.out.println(ArrayUtil.sumOfArray(arr));
        System.out.println(sumOfArray(4, 5, 6, 7)); // it will be 22;
    }
    // This parameter is called VAR ARGS -- > which is the same data type of elements - > same as array
    public static int sumOfArray (int ... arr) {
        int sum = 0;
        for (int eachNum : arr) {
            sum += eachNum;
        }
        return sum;
    }
}
