package Day_15_String;

public class IndexOfMethods {
    public static void main(String[] args) {
        String str = "pen";

        System.out.println(str.indexOf("p"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("n"));

        System.out.println(str.indexOf("x")); // all time he will be -1, if we don't have this letter in word;
        System.out.println(str.indexOf("j"));

        if (str.indexOf("x") == -1) {
            System.out.println("x is not in the word");
        }

        if (!str.contains("x")) {
            System.out.println("x is not in the word");
        }
        System.out.println("________________________________");
        String str2 = "pencil";
        System.out.println(str2.indexOf("p")); // it will be 0; It will look for the 'p' and will return index of the FIRST match;
        str2 = "encpil";
        System.out.println(str2.indexOf("p")); // it will be 3, because in this word letter 'p' placed in 3 character;

        System.out.println("________________________________");
        String str3 = "LoopCamp";
        //             01234567
        System.out.println(str3.indexOf("pC")); // it will be 3, because Index starts from 'p' and 'p' have a character 3;
        System.out.println(str3.indexOf("Camp")); // it will be 4, because Index starts from 'C' and 'C' have a character 4;
        System.out.println(str3.indexOf("Camping")); // it will be -1, because we don't have this word in String sentence;
    }
}
