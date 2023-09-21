package Day_07_Relational_Operators;

public class RelationOperatorExample {
    public static void main(String[] args) {

        System.out.println(10 > 5); // true
        System.out.println(10 < 5); // false

        int a = 5;
        int b = 3;

        System.out.println(a > b); // true
        System.out.println(a < b); // false

        boolean result1 = a > b;
        System.out.println(result1); // true
        boolean result2 = (a*b) > (a+b);
        System.out.println(result2); // true
        boolean result3 = a==b;
        System.out.println(result3); // false
        System.out.println('f' == 'g'); // false
        
    }
}
