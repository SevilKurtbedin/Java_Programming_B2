package Day_18_Loops;
/*
    madam ---> same start and end
 */
public class Palindrome {
    public static void main(String[] args) {
        String original = "Diliarka";
        String reversed = ""; // "avaj"
        // reading from beginning == reading from end;
        // reading from beginning ---> original;
        System.out.println(original);

        for (int i = original.length() - 1; i >= 0 ; i--) {
            reversed += original.charAt(i); // a + v = av + a = ava + j = avaj
        }
        System.out.println(reversed);
            if (original.equals(reversed)) {
                System.out.println("It is palindrome!");
            } else {
                System.out.println("It is NOT palindrome");
            }
    }
}
