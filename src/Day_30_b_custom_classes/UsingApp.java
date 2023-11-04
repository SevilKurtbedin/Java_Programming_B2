package Day_30_b_custom_classes;

public class UsingApp {
    public static void main(String[] args) {

        App appOne = new App();
        appOne.name = "Etsy";
        appOne.version = 5.7;
        appOne.isFree = true;

        System.out.println(appOne.name); // Etsy

        appOne.run();
        System.out.println(appOne.version); // 5.7
        appOne.update();
        System.out.println(appOne.version); // 6.7
        System.out.println(appOne.isFree);

        System.out.println(appOne);

        new App().run(); // null is running...;
        System.out.println(new App().name); // null
    }
}