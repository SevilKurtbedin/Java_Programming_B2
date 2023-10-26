package Day_25_Methods;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore(); // the value is not being used;
        int score = getCreditScore(); // the value is being stored into score variable;
        System.out.println(score);

        System.out.println(getCreditScore()); // it will be 800
        System.out.println(getCreditScore() + 50); // it will be 850

        System.out.println("______________________");
        System.out.println(isGoodCreditScore(600));
        System.out.println(isGoodCreditScore(700));

        System.out.println("______________________");
        System.out.println(isGoodCreditScore(getCreditScore())); // it will be 800;

        System.out.println("______________________");
        System.out.println(isGoodCreditScore(500) ? "Is GOOD score" : "Is NOT GOOD score");
    }
    public static int getCreditScore () { // non-parameterized return method
        return 800;
    }
    // create a method to check if it is good or not;
    public static boolean isGoodCreditScore (int score) {

        if (score >= 700) {
            return true;
        } else {
            return false;
        }
        // System.out.println("Hello"); this line will never be reached it this specific code;
    }
}
