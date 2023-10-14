package Day_21_Arrays;

public class Arrays {
    public static void main(String[] args) {
        int [] nums = {3, 5, 7, 8};
        int sum = 0;

        // Need to get each element one by one;

        for (int i = 0; nums.length > i; i++) {
            // System.out.println(nums[i]);
            sum += nums[i]; // sum = sum + nums[i];
        }
        System.out.println("Sum of total: " + sum);
    }
}
