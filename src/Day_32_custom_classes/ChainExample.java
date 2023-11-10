package Day_32_custom_classes;

public class ChainExample {
    // this();
    public ChainExample () {
        System.out.println("First");
    }
    public ChainExample (int i) {
        this();
        System.out.println("Second");
    }
    public ChainExample (String str) {
        this(5);
        System.out.println("Third");
    }
}
