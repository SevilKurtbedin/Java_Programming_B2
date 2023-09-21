package Day_06_Arithmetic_operators;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 0;
        System.out.println(x); // 0


        x = x + 1;
        System.out.println(x); // 1

        x = x + 1;
        System.out.println(x); // 2, because before that x = 1 "( 1 + 1 ) = 2"

        x = x + 1;
        System.out.println(x); // 3  because before that x = 2 "( 2 + 1 ) = 3"

        ++x;
        System.out.println(x); // 4 because + = 1 "1+1
    }
}
