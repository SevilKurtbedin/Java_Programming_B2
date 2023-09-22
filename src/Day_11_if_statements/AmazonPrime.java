package Day_11_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {
                /*
        Task:
            declare and assign a price variable
            declare and assign a boolean - hasPrime variable

            possible outputs:

                prime member:
                    Eligible for 2 day shipping

                not prime and item price is more than or equal 25:
                    Eligible for regular free shipping

                not prime and item price is less than 25:
                    Not eligible for free shipping. Shipping fee: 3.99

         */
        double price = 26.0;
        boolean hasPrime = true;

        String message = "";

        if (hasPrime) {
            message = "Eligible for 2 day shipping";
        } else {

            if (price >= 25) {
            message = "Eligible for regular free shipping";
            } else {
            message = "Not eligible for free shipping. Shipping fee: 3.99";
            }
        }
        System.out.println(message);

        if (hasPrime) {
            message = "Eligible for 2 day shipping";
        } else if (!hasPrime && price >= 25) { // Not a Prime Day and (&&) price more than 25$, because of delivery is free;
                message = "Eligible for regular free shipping";
        } else if (!hasPrime && price < 25) { // Not a Prime Day and (&&) price less than 25$, because of shipping fee on;
                message = "Not eligible for free shipping. Shipping fee: 3.99";
            }
        System.out.println(message);
        }
    }