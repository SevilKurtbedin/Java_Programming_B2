package Day_16_Loops;

public class Replace {
    public static void main(String[] args) {
        String str = "Java is a language";
        String first = str.substring(0, str.indexOf(" "));
        String second = str.substring(str.indexOf(" ") + 1);
        // of we used second = str.substring(str.length() + 1);
        System.out.println(first);
        System.out.println(second);
        System.out.println(second + " " + first);
    }
}