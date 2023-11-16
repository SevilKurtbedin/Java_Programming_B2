package Day_34_b_encapsulation.traffic;

public class TrafficLight {
    String color;
    public TrafficLight (String color) {
        this.color = color;
    }
    // read only
    public String getColor () {
        return color;
    }
    public void setColor (String color) {
        if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green") ||
        color.equalsIgnoreCase("yellow")) {
            this.color = color;
        } else {
            System.out.println("It is not valid color for traffic light");
        }
    }
}

