package Day_11_if_statements;

public class NestedExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = true;

        if (a) {
            System.out.println(1); // print

        if (b) {
            System.out.println(2);
            } else {
            System.out.println(3); // print
                }
        if (c) {
            System.out.println(4);
            } else {
            System.out.println(5); // print
            }
        }
    }
}
