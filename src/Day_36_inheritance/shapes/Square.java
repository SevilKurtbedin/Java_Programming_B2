package Day_36_inheritance.shapes;

public class Square extends Shapes {
    private int side;
    public Square (int side) {
        super("Square");
        setSide(side);
    }
    public void setSide (int side) {
        if (side > 0) {
            this.side = side;
        }
    }
    @Override
    public double area () { // Override this method
        return this.side * this.side;
    }
    @Override
    public double perimeter () {
        return side * 4;
    }
    @Override
    public String toString () {
        return "Side: " + side +
                "\nName: " + name;
    }
}
