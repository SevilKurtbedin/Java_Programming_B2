package Day_32_custom_classes;

public class TestChaining {
    public static void main(String[] args) {
        ChainExample object = new ChainExample();
        new ChainExample(); // it will be "First"

        System.out.println();
        new ChainExample(1);

        System.out.println();
        new ChainExample("Hello");
    }
}
