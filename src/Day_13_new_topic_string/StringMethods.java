package Day_13_new_topic_string;
// import.java.lang.String;

public class StringMethods {
    public static void main(String[] args) {
        String str = "LoopCamp"; // IMMUTABLE;
        str =  str + " is nice"; // Here, we made a completely new String;
        String name = "Jack";
        System.out.println(name == "Jack"); // true;
        System.out.println(name == "jack"); // false ---> NEVER YOU relational operator to compare the String;
        System.out.println(name.equals("Jack")); // true ---> comparing the values NOT the memory location;

        boolean result = name.equals("LoopCamp");
        System.out.println(result); // false;
        System.out.println(name.equalsIgnoreCase("JaCk")); // Output: Jack, because IgnoreCase;

        System.out.println("_______________________________________");

        String a = new String("hello"); // Here, if I change the value, a.equals(b) has false, if value are same ---> true;
        String b = new String("hello");
        System.out.println(a == b); // Here, we are comparing the memory location and SINCE both were made using the 'new' keyword, both of them in a different location in the Heap;
        System.out.println(a.equals(b)); // Here, we are comparing the VALUE itself. No matter the location is in the memory. I am comparing the values.

        System.out.println(a.length()); // .lenght(); returns the number of the character; Output: 5, because One letter = One character; if words have a 6 letter, output be 6;

    }
}
