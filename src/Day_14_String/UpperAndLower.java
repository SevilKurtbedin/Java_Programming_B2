package Day_14_String;

public class UpperAndLower {
    public static void main(String[] args) {
        String str = "LooPCamp";

        // Up to LowerCase;

        System.out.println(str);
        System.out.println(str.toLowerCase()); // is change String value to small letters; Output will be: loopcamp;

        str = str.toLowerCase();
        System.out.println(str); // it value are upgrade, because Java works from up to bottom, and from left to right;

        str = "LoopCamP";
        System.out.println(str.toUpperCase()); // ---> LOOPCAMP because .toUpperCase making all with capital letter;
        System.out.println(str); // it will be LoopCamP;
        str = str.toUpperCase(); // we are upgrade str value to UPPER;
        System.out.println(str); // it will be with capital letters: LOOPCAMP;

        System.out.println("_____________________");

        String word = "Hello";
        String word2 = word + " WORLD";
        System.out.println(word2); // Hello WORLD
        System.out.println(word); // Hello

        System.out.println(word.toUpperCase()); // HELLO
        System.out.println(word2.toLowerCase()); // hello world
        System.out.println(word.toLowerCase()); // hello

        System.out.println(word2); // Output: Hello WORLD;
        System.out.println(word); // Hello

        word2 += " Next Line";
        System.out.println(word2); // Output: Hello WORLD Next Line

        word2 = word2.toUpperCase();
        System.out.println(word2); // HELLO WORLD NEXT LINE; word2 += " Next Line" ---> word2 = word2 + " Next Line" ---> All CAPITAL;

    }
}
