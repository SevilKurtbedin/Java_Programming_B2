package Day_31_custom_classes;

public class TrafficLightUsing {
    public static void main(String[] args) {

        // Object reference = actual object;
        //                    new constructor;

        TrafficLight lightOne = new TrafficLight("Green");
        System.out.println(lightOne.light);

        System.out.println("____________");

        TrafficLight lightTwo = new TrafficLight("Yellow");
        System.out.println(lightTwo.light);

        System.out.println("_____________");

        TrafficLight lightThree = new TrafficLight("Red");
        System.out.println(lightThree.light);
    }
}
