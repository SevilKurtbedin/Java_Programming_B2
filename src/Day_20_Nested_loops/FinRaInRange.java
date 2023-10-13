package Day_20_Nested_loops;

import java.util.Scanner;

public class FinRaInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            String result = "";
            if (i % 3 == 0) {
                result += "fin";
            }
            if (i % 5 == 0) {
                result += "ra";
            }
            System.out.println(result.isEmpty()? i : result);
        }
    }
}
