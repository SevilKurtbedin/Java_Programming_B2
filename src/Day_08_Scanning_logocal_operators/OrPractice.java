package Day_08_Scanning_logocal_operators;

public class OrPractice {
    public static void main(String[] args) {
        int apples = 5;
        int oranges = 10;

        System.out.println(apples > 1 || oranges < 5);
        //                  true ||(OR) false = true
        System.out.println(apples > 10 || oranges == 10);
        //                  true ||(OR) true = true
        System.out.println(apples > 10 && oranges == 10);
        //                  false &&(AND) true = false
    }
}
