package Day_39_a_polymorphism.book;

public class JavaTextBook extends EBook {
    boolean isFun;

    @Override
    public void read() {
        System.out.println("Reading Java Text Book " + "\"" + super.name + "\".");
    }

    @Override
    public void download() {
        System.out.println("Downloading " + "\"" + super.name + "\".");
    }

    @Override
    public void open() {
        System.out.println("Opening " + "\"" + super.name + "\".");
    }
}
