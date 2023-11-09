package Day_31_custom_classes;

public class UsePhone {
    public static void main(String[] args) {
        Phone phoneOne = new Phone("iPhone 15", "Apple", 128, 2.0);
        System.out.println("#1 " + phoneOne);

        Phone phoneTwo = new Phone("iPhone 15", "Apple", 1, 2.0);
        System.out.println("#2 " + phoneTwo);

        Phone phoneThree = new Phone("iPhone", "Apple", 512, 2.0);
        System.out.println("#3 " + phoneThree);
    }
}
