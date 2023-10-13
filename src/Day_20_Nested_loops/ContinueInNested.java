package Day_20_Nested_loops;

public class ContinueInNested {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("i " + i);

            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    continue;
                }
                System.out.println("j " + j);
            }
            System.out.println();
        }
    }
}
