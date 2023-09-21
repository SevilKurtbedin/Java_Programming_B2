package Day_08_Scanning_logocal_operators;

public class OperatorPractice {
    public static void main(String[] args) {
        int w = 78 / 2 * (2 + 3) - 5 % 5;
        /*
                39 * (5) - 5 % 5;
                78    +3 - 5 % 5;
                78    +3 - 0;
                81       - 0;
                81
         */
        System.out.println(w);

        int a = 8;
        int b = a--;
                System.out.println(a); // a = 7;
                System.out.println(b); // b = 8;
        int l = 50;                    // 49, 50, 49 , 50
        int p = --l + l++ + l-- + l++; // p = 49 + 49 + 50 + 49 = 198;
        System.out.println(p); // 198
        System.out.println(l); // 50

        int r = 20;
        int k = -r-- + r++ + --r * r-- % 2;
                /*
                -20 + 19 + 19 * 19 % 2
                -20 + 19 +   361   %2
                -20 + 19 +    1
                    - 1  +    1
                    output: 0
                 */
                // -20 + 19 + 19 * 19 % 2 = 360;
        System.out.println(k); // 0
        System.out.println(r); // 18
    }
}
