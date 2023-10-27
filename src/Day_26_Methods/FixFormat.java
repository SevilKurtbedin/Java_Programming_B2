package Day_26_Methods;

public class FixFormat {
    public static String fixFormat (String name) {
        String fixed = name.substring(0, 1).toUpperCase() + "" + name.substring(1).toLowerCase();
        return fixed;
    }
    public static String fixFormat2 (String name) {
        String fixed2 = name.substring(0,1).toUpperCase() + "" + name.substring(1).toLowerCase() + "" +
                name.substring(name.lastIndexOf(" ") + 1);
        return fixed2;
    }

    public static void main(String[] args) {
        System.out.println(fixFormat("winnie"));
        System.out.println(fixFormat2("winnie pooh"));
    }
}
