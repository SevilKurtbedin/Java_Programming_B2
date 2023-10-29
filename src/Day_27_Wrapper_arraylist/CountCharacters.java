package Day_27_Wrapper_arraylist;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "bakj ksafT%^% &&224325D KSS";
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int symbol = 0;
        int space = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            if (Character.isUpperCase(eachLetter)) {
                upper++;
            } else if (Character.isLowerCase(eachLetter)) {
                lower++;
            } else if (Character.isDigit(eachLetter)) {
                digit++;
            } else if (eachLetter == ' ') {
                space++;
            } else {
                symbol++;
            }
            /*
            char eachLetter = str.charAt(i);
            if (eachLetter >= 'a' && eachLetter <= 'z') {
                lower++;
            } else if (eachLetter >= 'A' && eachLetter <= 'Z') {
                upper++;
            } else if (eachLetter >= '0' && eachLetter <= '9') {
                digit++;
            } else {
                symbol++;
            }
             */
        }
        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);
        System.out.println("Digit: " + digit);
        System.out.println("Space: " + space);
        System.out.println("Other: " + symbol);
    }
}
