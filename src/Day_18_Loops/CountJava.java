package Day_18_Loops;

public class CountJava {
    public static void main(String[] args) {
        /*
            "java is a language.java"
            if contains
            - > contain increase by 1
            - > is a java language.java
         */
        String str = "java is a java language.java";
        int count = 0;
        while (str.contains("java")) {
            str = str.replaceFirst("java", "*"); // it will be: * is a language.java
            count++;
            System.out.println(str);
        }
        System.out.println("Number of count is: " + count);
        System.out.println(str);
    }
}
