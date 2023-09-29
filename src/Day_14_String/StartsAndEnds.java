package Day_14_String;

public class StartsAndEnds {
    public static void main(String[] args) {
        /*
            .equals(String)
            .equalIgnoreCase(String)
            .length
            .toUpperCase
            .toLowerCase
         */
        String str = "Apples";
        System.out.println(str.startsWith("App")); // true, because word starts from App letters, if we have different values it will be false;
        System.out.println(str.startsWith("app")); // false, because App not.equal app;

        System.out.println(str.startsWith("Apples")); // true

        String str2 = "App";
        System.out.println(str.startsWith(str2)); // true

        System.out.println("________________");
        System.out.println(str.startsWith(" App")); // it will be false, because str = "Apple" not starts from space;
        System.out.println(str.startsWith(   "App")); // it will be true, because (   "App") in Java spase doesn't matter;

        System.out.println("________________");
        String sentence = "Its a good day";
        System.out.println(sentence.startsWith(" a good day")); // false, because sentence starts from "Its";
        System.out.println(sentence.endsWith(" good day")); // its action is true;
        System.out.println(sentence.endsWith(" day")); // its action is true;
        System.out.println(sentence.endsWith("d day")); // its action is true;
        System.out.println(sentence.endsWith("Its a good day")); // its action is true;
        System.out.println(sentence.endsWith("dd day")); // its action is false, because we don't have a double dd;



    }
}
