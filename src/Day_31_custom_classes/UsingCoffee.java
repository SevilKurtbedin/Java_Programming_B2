package Day_31_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {
        Coffee coffeeOne = new Coffee();
        coffeeOne.price = 4.99;
        coffeeOne.size = 16;
        coffeeOne.brand = "Mehmet Coffee";
        coffeeOne.type = "Latte";

        System.out.println(coffeeOne);
        coffeeOne.drink();
        coffeeOne.refill(5);
        System.out.println(coffeeOne);
    }
}
