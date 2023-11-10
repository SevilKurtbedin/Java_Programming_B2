package Day_32_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class MeOffers {
    public static void main(String[] args) {

        Offer a1 = new Offer("Apple", "California", 100_000, true, 21);
        OfferV2 a2 = new OfferV2("Samsung", "Seoul", 120_000, true, 28);

        System.out.println(a1);
        System.out.println();
        System.out.println(a2);

        System.out.println("_______________________________");

        String str = new String("Hello World");

        ArrayList <String> list2 = new ArrayList<>();
        list2.add(new String("Hello"));
        list2.add(new String("Bye"));
        list2.add(new String("Loop Camp"));
        list2.add(0, str);
        System.out.println(list2);

        System.out.println("_______________________________");

        ArrayList <OfferV2> offers = new ArrayList<>();
        offers.add(a2);
        System.out.println(offers);

        OfferV2 a3 = new OfferV2("Amazon", "Seattle", 200_000, false, 300);
        offers.add(a3);
        System.out.println(offers);

        System.out.println("_______________________________");
        for (OfferV2 each : offers) {
            System.out.println(each);
            System.out.println();

            System.out.println("_______________________________");
            String [] strArr = new String[4];
            strArr[0] = new String("Loop Camp");
            System.out.println(Arrays.toString(strArr));

            System.out.println("*******************************");
            OfferV2 [] strArr2 = new OfferV2[3];
            strArr2[0] = a3;
            System.out.println(Arrays.toString(strArr2));


        }
    }
}