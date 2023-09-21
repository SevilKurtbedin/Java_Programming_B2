package Day_09_b_if_statements;

import java.util.Scanner;

public class CheckHungry {
    public static void main(String[] args) {
        System.out.print("Are you hungry? True/False: ");
        Scanner input = new Scanner(System.in);


        boolean isHungry = input.nextBoolean();

        if (isHungry) {
            System.out.println("You are hungry, so I will order some food"); // true
        } else {
            System.out.println("Great, go practice Java"); // false
        }
    }
}
