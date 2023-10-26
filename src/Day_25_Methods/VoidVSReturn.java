package Day_25_Methods;

public class VoidVSReturn {
    public static void hello () {
        System.out.println("Hello");
    }
    public static String bye () {
        return "Bye";
    }

    public static void main(String[] args) {
        hello();
        bye();
        System.out.println(bye());
        String str = "";
    }
}
