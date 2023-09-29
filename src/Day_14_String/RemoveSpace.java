package Day_14_String;

public class RemoveSpace {
    public static void main(String[] args) {
        /*
            .equals(String)             ---> return boolean
            .equalIgnoreCase(String)    ---> return boolean
            .length                     ---> return int
            .toUpperCase                ---> return new String all in UPPERCASE
            .toLowerCase                ---> return new String all in LOWERCASE
            .startsWith(String)         ---> return boolean
            .endsWith(String)           ---> return boolean
            .contains(String)           ---> return boolean
         */
        String s = "    Thursday    ";
        System.out.println(s);
        System.out.println(s.length()); // 16

        System.out.println(s.trim()); // no space in beginning and no space after; trim ----> cut;
        // if we added "    Thursday    party   " he cut only begin and end ---> "Thursday  party";
        System.out.println(s.length()); // still 16;
        s = s.trim();
        System.out.println(s.length()); // it will be 8;

        System.out.println("__________");
        System.out.println(s.startsWith("Thu")); // Yes, its true;

        String str = "    Java is fun    ";
        System.out.println(str.startsWith("Java is")); // false

        str.trim();
        System.out.println(str.endsWith(" fun")); // it will be false, because str = " fun  ", he have a space;

        str = str.trim();
        System.out.println(str.endsWith(" fun")); // it true, because we used .trim() and he cut alle spaces and action will be true;
    }
}
