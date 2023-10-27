package Day_26_Methods;

public class Painter {
    public static void main(String[] args) {
        Picture.draw(); // Trying to draw...
        Picture.draw("Green"); // Trying to draw with Green
        Picture.draw(5); // Trying to draw with size of 5
        Picture.draw("green", "orange"); // Trying to draw with colors green and orange
        Picture.draw("green", 5); // Trying to draw with color green and size of 5
        Picture.draw("red", 6); // Trying to draw with color red and size of 6
        Picture.draw(6, "orange"); // Trying to draw with color orange and size of 6
        Picture.test(6.5); // Testing with double: 6.5
        Picture.test(6); // Testing with double: 6.0
    }
}
