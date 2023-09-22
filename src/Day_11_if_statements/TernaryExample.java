package Day_11_if_statements;

public class TernaryExample {
    public static void main(String[] args) {

        int a = 4;
        String evenOrOdd = "";

        if (a % 2 == 0) {
            evenOrOdd = "Even";
        } else {
            evenOrOdd = "Odd";
        }
        System.out.println(evenOrOdd);
        // In Java, there is shorter SYNTAX version of if else
        evenOrOdd = (a % 2 == 0) ? "Even" : "Odd";
        /*
        (a % 2 == 0) -----> condition
                   ? -----> if TRUE or FALSE
              "Even" -----> first value is always for TRUE
                   : -----> else
               "Odd" -----> second value is always for FALSE

               first and second value HAS TO BE SAME DATA TYPE
         */
        int num = 4;
        String result = (num > 10) ? "BiggerThanTen" : "NotBiggerThanTen";
        System.out.println(result);

        int number = -4;
        String sign = (number > 0) ? "positive" : (number < 0) ? "negative" : "Zero";
        System.out.println(sign);
        /*
            SYNTAX
                    (condition) ? value1 : value2
         */
        if (number > 0) {
            sign = "positive";
        } else {
            if (number < 0) {
                sign = "negative";
            } else {
                sign = "zero";
            }
        }
        System.out.println(sign);
    }
}
