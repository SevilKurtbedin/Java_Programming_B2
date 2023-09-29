package Day_14_String;
/*  .trim()         ---> returns new String removing spaces from BEGINNING to END ONLY.
    .isEmpty()      ---> return boolean if there is NO CHARACTER at all including space -- > "";
    .isBlank()      ---> return boolean is there ONLY EMPTY SPACES inside the double quotation
 */

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "last example";
        System.out.println(str.isEmpty());

        str = ""; // REASSIGNED IT to "";
        System.out.println(str.isEmpty()); // it true;

        str = " "; // REASSIGNED IT to " ";
        System.out.println(str.isEmpty()); // it false, because empty space is a CHARACTER;

        str = " "; //
        System.out.println(str.isBlank()); // it true, just a space;

        str = "          "; // it will be true for .isBlank, doesn't matter how many spaces we have;

        str = "        .          ";
        System.out.println(str.isBlank()); // it false, because we have a dot " . " in action;
    }
}
