package Day_19_Nested_loops;

public class NestedLoopExample2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
        System.out.println("Hello Universe");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }
        System.out.println("Hello Universe");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }
        System.out.println("Hello Universe");
        System.out.println("______________");

        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Hello World");
            }
            System.out.println("Hello Universe");
        }
    }
}
