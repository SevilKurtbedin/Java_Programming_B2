package Day_14_String;

public class RecapMethods {
    public static void main(String[] args) {
        String s = "pen"; // s is a String literal, si it is in the String Pool
        String s2 = new String("pen"); // s2 is the object in the HEAP, because we used 'new' keyword;

        System.out.println("Compare with == " + (s == s2)); // === ----> compares the memory location. It will be false;
        System.out.println("Compare with .equals(String) == " + (s.equals(s2))); // ----> it will be true, if we change a value, for example s2 = "pen", we change "pen 1" it will be false;

        System.out.println("Compare with .equals(String) == " + (s.equals("Pen"))); // ---> compares the value to be EXACT same. It will be false;
        s = "Pen";
        System.out.println("Compare with .equals(String) == " + (s.equals("Pen"))); // ---> compares the value to be EXACT same. It will be true;
        String ss = "Pen";
        System.out.println("Compare with .equals(String) == " + (s.equals(ss))); // ---> compares the value to be EXACT same. It will be true;

        s = "Pen";
        ss = "pen";
        boolean isSame = s.equalsIgnoreCase(ss); // This will compare two objects value by ignoring the CASE SENSITIVENESS;
        System.out.println(isSame); // It will be true, because we are comparing by ignoring;

        if(isSame) {
            System.out.println("Hello");
        }

        ss = "PENN";

        if (s.equalsIgnoreCase(ss)) { // PEN <---> PENN   | penn <---> penn
            System.out.println("World"); // It will be false, because we are comparing value with a different numbers of character;
        } else {
            System.out.println("Yes, it will be true"); // because we used else method;
        }

        System.out.println("____________________________________________________________");

        // s ---> PEN
        // ss ---> PENN

        System.out.println(s.length()); // 3 character; In Java, the .length() method is used to get the length or size of certain data structures;
        System.out.println(ss.length()); // 4 character

        int a = s.length(); // 3
        int b = ss.length(); // 4

        if(s.length() < 2) { // s = 3, 3 more than 2. if we change for example s.length < 4 --> 3 < 4 its ture, and first word print, second are not;
            System.out.println("Short world"); // it will be false and not to print, because this is false value.
        } else {
            System.out.println("Not short"); // it will be true, because we use else, and first value are false;
        }

        if (a < 4) { // 3 < 4
            System.out.println("Second example"); // it will be true, because the action we have given is correct, I mean 3 < 4; (3 < 4) is are our action;
        }
        System.out.println("-----------------");
        System.out.println("aaaaaa".length()); // 6
        System.out.println("a    a".length()); // 6
        System.out.println("".length()); // 0
        System.out.println(""); // This is just an empty String
    }
}
