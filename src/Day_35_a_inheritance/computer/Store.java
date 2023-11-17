package Day_35_a_inheritance.computer;

public class Store {
    public static void main(String[] args) {

        Computer computerOne = new Computer("General OS", 512);
        System.out.println(computerOne);

        Mac macOne = new Mac(128);
        Mac macTwo = new Mac( 256);
        Mac macThree = new Mac( 512);
        Mac macFour = new Mac(1024);
        System.out.println(macOne);

        Windows windowsOne = new Windows(128);
        Windows windowsTwo = new Windows(256);
        Windows windowsThree = new Windows(512);
        Windows windowsFour = new Windows(1024);
        System.out.println(windowsOne);
    }
}
