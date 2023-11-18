package Day_36_inheritance.shapes;

public class Circle extends Shapes {
    private int radius;
    public Circle (int radius) {
        super("Circle");
        this.radius = radius;
    }
    public void setRadius (int radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }
    @Override
    public double area () {
        return radius * radius * Math.PI;
    }
    @Override
    public double perimeter () {
        return radius * 2 * Math.PI;
    }
    @Override
    public String toString () {
        return "Radius: " + radius +
                "\nName: " + name;
    }
}
