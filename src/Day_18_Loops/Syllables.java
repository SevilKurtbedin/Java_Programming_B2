package Day_18_Loops;

public class Syllables {
    public static void main(String[] args) {
        String str = "ja-va-script-Sevil";
        int countDash = 0;
        for (int i = 0; i < str.length(); i++) {
            // check if character is equal to '-';
            if (str.charAt(i) == '-') {
                countDash++;
            }
        }
        System.out.println("Syllables: " + (countDash + 1));
    }
}