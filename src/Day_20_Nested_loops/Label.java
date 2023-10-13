package Day_20_Nested_loops;

public class Label {
    public static void main(String[] args) {
        here:
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("i " + i);

            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    break here;
                }
                System.out.println("j " + j);
            }
            System.out.println();
        }
    }
}
