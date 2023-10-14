package Day_21_Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int [] num = {23, 23, 65, 786, 23, 67, 7886};
        int max = num [0];
        int min = num [0];
        for (int i = 0; i < num.length; i++) {
            int eachElement = num [i];

            if (eachElement < min) {
                min = eachElement;
            }
            if (eachElement > max) {
                max = eachElement;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
