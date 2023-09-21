package Day_08_Scanning_logocal_operators;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Natalia";
        boolean isCitizen = true;
        boolean isCriminal = true;
        int age = 12;
        boolean isEligible = isCitizen && isCriminal || age >= 18;
        //                      true        false       true

        System.out.println(name + " is eligible to vote: " + isEligible);
    }
}
