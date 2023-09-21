package Day_05_Variable;

public class CellPhone {
    public static void main (String [] args){

        String brand = "Apple";
        String model = "iPhone 14 pro Max";
        String color = "Dark";
        double price = 1199.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an " + model + " from " + brand);
        System.out.println("It came in the " + color + " and hi has " + storage);
        System.out.println("For the sim type " + sim + " with a camera " + hasCamera + ", the total price was $" + price);

        String fullMassage = "I have an " + model + " from " + brand + "It came in the " + color + " and hi has " + storage +
                "For the sim type " + sim + " with a camera " + hasCamera + ", the total price was $" + price;

        System.out.println();
        System.out.println(fullMassage);

    }
}
