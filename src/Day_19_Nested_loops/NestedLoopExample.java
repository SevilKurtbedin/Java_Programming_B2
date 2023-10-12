package Day_19_Nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {
        for (int week = 1; week <= 4; week++) {
            System.out.println("Week: " + week);

            // inter loop
            for (int day = 1; day <= 7; day++) {
                System.out.println("Day: " + day);
                if (week == 1 && day == 1) {
                    System.out.print("\t\tToday is mentor session\n");
                }
            }

            System.out.println();
        }
    }
}
