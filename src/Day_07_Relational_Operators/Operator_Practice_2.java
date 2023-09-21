package Day_07_Relational_Operators;

public class Operator_Practice_2 {
    public static void main(String[] args) {
        int a = 40; // after --a ---> a = 39;
        System.out.println(--a); // post-decrement ---> output: 39;
        System.out.println(--a); // post-decrement ---> output: 38;
        System.out.println(a--); // output here: 38, but after a = 37;
        System.out.println(--a); // a--=38 ---> a = 37 ---> --a = 36 ---> a = 36;
        System.out.println(--a); // output: 35;
        System.out.println(a--); // output: 35 but after a = 34;
        System.out.println(a); // output: 34

    }
}
