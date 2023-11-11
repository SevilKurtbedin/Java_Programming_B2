package Day_33_a_Static_Intro;

public class iPhone {
    String model;
    double price;
    static String company;
    static String os;
    static boolean appleDay;
    static String day;  //

    // Runs only ones, before anything
    // It helps us to INITIALIZE out STATIC Variables.
    static {
        System.out.println("Running STATIC");
        company = "Apple";
        day = "Friday";
        os = "IOS";

        if (day.equals("Friday")) {
            appleDay = true;
        }
    }
    public iPhone (String model, double price){
        System.out.println("Running CONSTRUCTOR");
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iphone Info: " +
                "\n\tModel: " + model +
                "\n\tPrice: $" + price +
                "\n\tCompany: " + company;
    }
}

