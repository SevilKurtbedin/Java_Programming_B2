package Day_09_b_if_statements;

public class SingleIfExamples {
    public static void main(String[] args) {
        if (false) {
            System.out.println("Hello World");
        }

            System.out.println("Second Line");

        if (true){
            System.out.println("Today is Saturday");

        int score = 75;
        if (score >= 75) {
            // false
                System.out.println("You passed the exam!");
            }
        if (score < 75) {
            System.out.println("You failed");
        }
        int year = 2023;
        boolean isLockdown = year == 2020 || year == 2021;
                            // false      OR      true ----> true
            if (isLockdown) {
                System.out.println("Stay at home");
            }
            if (!isLockdown) {
                System.out.println("Party");
            }
        }
    }
}
