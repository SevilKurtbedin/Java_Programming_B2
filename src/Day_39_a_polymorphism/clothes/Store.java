package Day_39_a_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {
        // ALL POSSIBLE REFERENCE

        // #1 - REFERENCE ITSELF
        TShirt tShirt1 = new TShirt();
        tShirt1.wear();

        // #2 - REFERENCE is SUPER (which in abstract class)
        Clothes tShirt2 = new TShirt();
        tShirt2.wear();

        // #3 - Object Class
        Object tShirt3 = new TShirt();
        /*
        tShirt3.wear();
        Object class does not have reference to the wear() method;
         */

        // HasHood tShirt4 = new TShirt();
        // TShirt class does NOT have implements to ware() method;

        // ______________________________________________________

        System.out.println();

        // All possible references for Jacket
        // IN polymorphism we can have 3 (three) references, if we have extends and implements

        // #1 - ITSELF
        Jacket jacket1 = new Jacket();
        jacket1.wear();
        jacket1.punOfHood();

        // #2 - SUPER CLASS
        Clothes jacket2 = new Jacket();
        jacket2.wear();
        // jacket2.punOfHoof(); -> it will be failed, because Clothes class do not have a implement with HasHood;

        System.out.println();

        // #3 - Interface
        HasHood jacket3 = new Jacket();
        // jacket3.wear(); -> it will be failed, because HasHood class do not have reference with Clothes;
        jacket3.punOfHood();

        Object jacket4 = new Jacket();
        /*
        jacket4.wear();
        jacket4.punOfHood();

        Object class does not have reference to wear() and punOfHood();
         */
        System.out.println();

        buy(tShirt1);
        buy(jacket1);
        buy(new TShirt());
        buy(new Jacket());
    }
    public static void buy (Clothes clothes) {
        if (clothes instanceof TShirt) {
            System.out.println("Bought TShirt");
        } else if (clothes instanceof Jacket) {
            System.out.println("Bought Jacket");
        }
    }
}
