package Day_33_a_Static_Intro;

public class AppleStore {
    public static void main(String[] args) {

        iPhone phone1 = new iPhone("Iphone 14", 999.99);
        iPhone phone2 = new iPhone("Iphone 15", 1099.99);

        System.out.println(phone1);
        System.out.println(phone2);

        // System.out.println(iPhone.company);
        // System.out.println(phone1.company);
        // System.out.println(phone2.company);

        System.out.println(iPhone.company); // Apple
        System.out.println(iPhone.os); // IOS
        System.out.println(iPhone.appleDay); // true -> Friday
    }
}
