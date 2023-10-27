package Day_26_Methods;

public class CountNumbers {
    public static void count (int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Total is: " + sum);
    }
    public static int getSum (int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        count(5);
        count(6);
        count(10);
        System.out.println("___________");
        System.out.println("From Return Type Method. Sum is: " + getSum(5)); // 15
        System.out.println("From Return Type Method. Sum after adding 5 is: " + (getSum(5) + 5)); // 20
    }
}
