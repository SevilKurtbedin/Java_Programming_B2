package Day_06_Arithmetic_operators;

public class IncrementExample3 {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(x); // x = 0
        System.out.println(x); // x = 0
        System.out.println(x++ +100); // x = 0
        //                  1     2     3     4
        System.out.println(x++ + x++ + x++ + x++ +200); // 210
        System.out.println(x++); // 5
        System.out.println(x); // 6
        System.out.println(x--); // 6
        System.out.println(x); // 5
        System.out.println(x); // 5
        System.out.println(++x); // 6
        System.out.println(x); // 6
        System.out.println(++x); // 7
        System.out.println(x); // 7
    }
}
