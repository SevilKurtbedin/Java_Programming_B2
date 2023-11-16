package Day_34_b_encapsulation.traffic;

public class Road {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Green");
        // light.color = "Red";
        System.out.println(light.getColor()); // Green
        TrafficLight light1 = new TrafficLight("Yellow");
        System.out.println(light1.getColor()); // Yellow
        System.out.println();
        light1.setColor("Red");
        light.setColor("Pink");
        System.out.println();
        System.out.println(light.getColor());
        System.out.println(light1.getColor());

    }
}
