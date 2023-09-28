package Day_13_new_topic_string;

public class StringMemory {
    public static void main(String[] args) {
        int num = 4;
        byte num2 = 5;
        char letter = 'f';
        boolean result = true;
        double num3 = 34.5;
        String first = "Java"; //                      1) String literal ---> Stored ---> Heap Pool;
        String second = new String("Hello"); // 2) String object (String by new keyword) ---> Stored in Heap; ---> not in Pool, Directly in the Heap;
        String third = "Java"; //                      3) String literal ---> Stored ---> Heap Pool; Same with "first";
        System.out.println(first == second); //        4) Output: false, because variables have a different storage;
        System.out.println(first == third);  //        5) Output: true, because variables have a same storage;
        String fourth = new String("Java");
        System.out.println(second == fourth); //       6) Output: false, because variables have a different storage in Heap;
    }
}
