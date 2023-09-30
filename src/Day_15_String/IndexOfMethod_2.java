package Day_15_String;

public class IndexOfMethod_2 {
    /*
        .charAt(index);
        .indexOf("")
        .indexOf('')
        .indexOf('', startIndex)
        .lastIndexOf("")
        .lastIndexOf('')
        .lastIndexOf('', startIndex)
        .substring(startIndex);
        .substring(startIndex, endIndex);
     */
    public static void main(String[] args) {
        String str = "definition";
        //            012345678
        System.out.println("First 'i' index: " + str.indexOf("i"));
        System.out.println("Last 'i' index: " + str.lastIndexOf("i")); // we can do it with character as well;

        System.out.println("Second 'i' index: " + str.indexOf('i', 4));

        System.out.println("Second 'i' index: " + str.indexOf('i', str.indexOf('i')+1));
    }
}
