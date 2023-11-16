package Day_34_b_encapsulation.pizza;

public class Pizza {
    String size;
    private int numberOfToppings;
    public Pizza(String size, int numberOfToppings) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }
    private void setSize (String size) {
        if (size.equalsIgnoreCase("Large") ||
                size.equalsIgnoreCase("Medium") ||
                size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else {
            System.err.println("ERROR! Wrong size");
        }
    }

    @Override
    public String toString() {
        return "\t~ Pizza ~\t" +
                "\nSize: " + size +
                "\nNumber of Toppings: " + numberOfToppings +
                "\nTotal price: " + calculatePrice() + "$";
    }
    public double calculatePrice () {
        double totalPrice = 0;
        if (size.equalsIgnoreCase("small")) {
            totalPrice = 10.99 + (numberOfToppings * 0.75);
        } else if (size.equalsIgnoreCase("medium")) {
            totalPrice = 15.99 + (numberOfToppings * 0.75);
        } else if (size.equalsIgnoreCase("large")) {
            totalPrice = 20.99 + (numberOfToppings * 0.75);
        }
        return totalPrice;
    }

    private void setNumberOfToppings (int numberOfToppings) {
        if (numberOfToppings >= 0) {
            this.numberOfToppings = numberOfToppings;
        } else {
            System.err.println("ERROR! WRONG number of toppings");
        }
    }
}
