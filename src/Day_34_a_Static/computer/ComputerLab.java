package Day_34_a_Static.computer;

public class ComputerLab {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Computer comp1 = new Computer("MAC", 1099.99, "Silver");
        Computer.hasBattery = false;
        System.out.println(Computer.hasBattery);

        System.out.println(comp1.brand);
        System.out.println(comp1.color);

        System.out.println(comp1.hasBattery); // NOT RECOMMENDED
        // We still can access the static members with the object reference but it is NOT RECOMMENDED.

        //System.out.println(Computer.brand); // CANNOT DO THIS
        // In order to access to INSTANCE VARIABLES we HAVE TO create an OBJECT of class



    }

}
