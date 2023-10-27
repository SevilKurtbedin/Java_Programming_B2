package my_utilites;

public class StringUtil {
    /**
     * This method reverses the given String.
     * @return reversed version
     */
    public static String reverse (String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
    /**
     * This method is finding how many times given character exists in given String
     * @return the number of the existence.
     * Made by @Sevil
     */
    public static int frequencyOfCharacters (String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
    /**
     * Fix Format - method fixes the format of the given String Making first letter upper case and rest in lowercase.
     * @return fixed format
     */
    public static String fixFormat (String name) {
        String fixed = name.substring(0, 1).toUpperCase() + "" + name.substring(1).toLowerCase();
        return fixed;
    }
    /**
     * This method checks if given String is palindrome.
     * @return True if it is or False if it is not.
     */
    public static boolean isPalindrome (String word) {
        String reversed = ""; // for example my name: Sevil. It false. But word: racecar, is true;
        for (int i = word.length() - 1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }

    /**
     * This method check for the unique characters in the given String.
     * @return Only the unique characters.
     */
    public static String uniqueCharacters (String str) {

        String uniques = "";

        for (int i = 0; i < str.length(); i++) {

            char eachOuterLetter = str.charAt(i);
            int count = 0;


            for (int j = 0; j < str.length(); j++) {

                char eachInnerLetter = str.charAt(j);

                if (eachOuterLetter == eachInnerLetter) {
                    count++;
                }

            }

            if (count == 1) { // This condition check if the letter is in the String ONLY 1 time. If, TRUE, add it into the new String container called 'uniques'
                uniques += ("" + eachOuterLetter); // uniques = uniques + ("" + eachOuterLetter);
            }

        }

        return  uniques;
    }
}
