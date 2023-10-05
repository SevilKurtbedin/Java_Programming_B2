package Day_16_Loops;

public class MethodChaining {
    public static void main(String[] args) {
        String str = "  java   ";
        // I want to remove space and I want to make all UPPERCASE


        //Here we just did two different method on a different reassignments
        //str = str.trim();
        //str = str.toUpperCase();

        // as long as the method returns a STRING you can keep chaining
        str.trim().toUpperCase().toLowerCase().substring(0, 3).charAt(0);
        System.out.println(str);
    }
}