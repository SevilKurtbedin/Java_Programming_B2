package Day_18_Loops;

public class CharacterAsNumbers {
    /*
            Characters in String
                Given a String print the ascii value codes for each character
                    Example:
                        Input:
                                java
                        Output:
                                106 97 118 97
 */
    public static void main(String[] args) {
        String str = "loop"; // length(); ---> 4
        //            0123

        for (int i = 0; i < str.length(); i++) {
            System.out.print((int)str.charAt(i) + " ");
        }

    }
}
