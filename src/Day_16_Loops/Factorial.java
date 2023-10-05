package Day_16_Loops;

public class Factorial {
    public static void main(String[] args) {
        // find factorial of 5!
    int num = 5;
    int result = 1;
    while (num >= 1) {
        System.out.print("Result so far: " + result + " * " + num);
        result *= num;
        num--;
        System.out.println(" = " + result);
        }
        System.out.println("Total is: " + result);
    }
}
