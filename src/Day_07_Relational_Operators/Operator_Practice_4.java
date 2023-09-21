package Day_07_Relational_Operators;
public class Operator_Practice_4 {
    public static void main (String [] args) {
            int t = 100; //  101, 100, 101, 100


            //    = -101 * -101 / 100 + 100 ---- > 10201 / 100 + 100 -- > 102 + 100 = 202
            int p = - ++t * -t-- / t++ + --t;

            int c = 10201 % 100; // 1

            System.out.println("t: " + t); //100
            System.out.println("p: " + p); //202
            System.out.println("c: " + c); // output = 1;


        }
    }
