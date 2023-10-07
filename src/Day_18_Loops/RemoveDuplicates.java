package Day_18_Loops;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String original = input.nextLine();
        String unique = "";

        for (int i = 0; i < original.length(); i++) {
            if (!unique.contains("" + original.charAt(i))) {
                unique += original.charAt(i);
            }
        }
        System.out.println("With duplicate: " + original);
        System.out.println("Without duplicate: " + unique);
    }
}
