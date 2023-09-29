package Day_14_String;

public class Contains {
    public static void main(String[] args) {
        /*
            .equals(String)
            .equalIgnoreCase(String)
            .length
            .toUpperCase
            .toLowerCase
         */
        String day = "Today it was a Java class.";
        System.out.println(day.contains("it was")); // true;
        System.out.println(day.contains("itwas")); // false, because it was different of itwas;

        String str = "was a SoftSkills";
        System.out.println(day.contains(str)); // false;
        System.out.println(day.contains("Today class.")); // false
        System.out.println(day.contains("It was a Java class.")); // false
        System.out.println(day.contains("")); // true, because day have a space;
        System.out.println(day.contains("w")); // true, because action day have a 'w' letter in data;
        System.out.println(day.contains("x")); // false, because action day don't have a 'x' letter in data;

        System.out.println("____________");

        System.out.println(day.contains("5")); // false
        System.out.println(day.contains("")); // true, because we have the empty String in all in the day action;

        System.out.println(day + " Or not."); // Today it was a Java class.";
        System.out.println(day.contains(" Or not.")); // false;

        System.out.println("__________________");

        System.out.println((day + " Or not.").contains(" Or not.")); // its will be true, because we added " Or not." to our action;
        System.out.println(day.contains(" Or not.")); // false;

        if (day.contains("Java")) { // Today it was a Java class. Our sentence have a Java word. It will be true;
            System.out.println("There is a codding language name in this sentence");
        }

    }
}
