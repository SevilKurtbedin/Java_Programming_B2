package Day_16_Loops;

public class PrintNumbers {
    public static void main(String[] args) {
        int num = 2;
        while (num <= 10) {
            System.out.println("Odd: " + num);
            num += 2;
        }

        int i = 1;
        while (i <= 20) {
            i++;
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }

        // odd number form 1 to 50;
        int b = 1;
        while (b <= 50) {
            if (b % 2 != 0) {
                System.out.println(b);
            }
            b++;
        }
    }
}
