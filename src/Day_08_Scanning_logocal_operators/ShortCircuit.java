package Day_08_Scanning_logocal_operators;

public class ShortCircuit {
    public static void main(String[] args) {
        /*
        &&
        ________________________
        True && True ---> True
        False $$ True ---> False
        True && False ---> False
        False && False ---> False

        int a = 10;
        System.out.println (false && (a++ > 11));
                            false && false = false
        System.out.println (false & (a++ > 11));

        ||
        ________________________
        True || True ---> True
        False || True ---> True
        True || False ---> True
        False || False ---> False
         */
        int a = 10;
        System.out.println(false && (a++ > 11)); // false
        System.out.println(false & (a++ > 11)); // false
        System.out.println(true || 5/0 == 0); // true
        System.out.println(false && 5/0 == 0); // false true = false
    }
}
