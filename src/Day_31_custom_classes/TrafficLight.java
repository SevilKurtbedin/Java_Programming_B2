package Day_31_custom_classes;

public class TrafficLight {
    String light;
    // We explicitly defined a constructor
    // The default constructor will not be created;
    public TrafficLight (String color) {
        light = color;
        if (light.equalsIgnoreCase("Green")) {
            System.out.println("You can drive");
        } else if (light.equalsIgnoreCase("Yellow")) {
            System.out.println("Let all traffic participants pass and then drive");
        } else  if (light.equalsIgnoreCase("Red")) {
            System.out.println("! STOP !");
        } else {
            System.out.println("Invalid Input!");
        }
    }
}
