package Day_08_Scanning_logocal_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(n > 5); // true
        System.out.println(n < 10); // false
        System.out.println(n > 5 && n < 10); // 5 < n < 10
        //                  true     false
        // 20 is more than 5 or 20 is less than 10 ---> false
        System.out.println(n > 5 || n < 10);
        // 20 is more than 5 or 20 is less than 10 ---> true

        System.out.println(4 > 3 || false);
        //                  true || false = true
        System.out.println(3 < 4 || false);
        //                  true || false = true
        System.out.println(!false); // true
        System.out.println(!true); // false

        System.out.println();
    }
}
