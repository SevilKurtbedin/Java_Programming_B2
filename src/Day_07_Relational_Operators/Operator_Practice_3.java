package Day_07_Relational_Operators;

public class Operator_Practice_3 {
    public static void main(String[] args) {
        int h = 5; // I declared an int variable called h and assign a value 5 to it.
        int p = h; // I declared an int variable called p and assigned a value variable h.

        h++; // post-increment | Just increase by 1
        p = h; // if we update p here, after h++ ---> h = p = 6;
        System.out.println(h); // output: 6
        System.out.println(p); // output: after update p = 6; before update p = 5;

        int k = h++; // output: 6
        System.out.println("h: " + h ); // output: 7
        System.out.println("k: " + k); // output: 6 because k = h++ = 6;

        int g = ++h; // output: 8
        System.out.println("h: " + h);
        System.out.println("g: " + g);
    }
}
