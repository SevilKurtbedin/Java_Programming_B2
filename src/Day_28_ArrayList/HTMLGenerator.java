package Day_28_ArrayList;

public class HTMLGenerator {
    /*
    div^3
    <div></div>
     */
    public static void main(String[] args) {
        System.out.println(htmlGenerator("div^3"));
        System.out.println(htmlGenerator("script^8"));

    }
    public static String htmlGenerator (String str) {
        String result = "";
        String [] parts = str.split("\\^"); // this is used for reg ex ---> so, we need use forward slash;
        // ["div", "3"]
        //    0     1
        int num = Integer.parseInt(parts[1]); // 3
        for (int i = 0; i < num; i++) {
            result += "<" + parts [0] + "></" + parts [0] + ">";
        }
        return result;
    }
}
