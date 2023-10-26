package Day_25_Methods;
/*
    1$ = 0.95 Euro;
    1$ = 150.23 Yen
    1$ = 28.5 Lira
    1$ = 83.17 Rupees
 */
public class CurrentlyConverter {
    public static double convert (String currencyType, double amount) {
        switch (currencyType.toLowerCase()) {
            case "euro":
                return amount * 0.95;
            case "yen":
                return amount * 150.23;
            case "lira":
                return amount * 28.5;
            case "rupees":
                return amount * 83.17;
            default:
                return amount * 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Today Euro: " + convert("Euro", 100));
        System.out.println("Today Yen: " + convert("Yen", 100));
        System.out.println("Today Lira: " + convert("Lira", 100));
        System.out.println("Today Rupees: " + convert("Rupees", 100));
    }
}
