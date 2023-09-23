package Day_12_new_topic_switch;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gradeLevel = input.nextInt();
        String location;
        int numberOfGroup;
        String teacher;

        if (gradeLevel >= 1 && gradeLevel <= 6) {

            if (gradeLevel == 1) {
                location = "Apple orchard";
                numberOfGroup = 2;
                teacher = "Mr. Smith";
            } else if (gradeLevel == 2) {
                location = "Zoo";
                numberOfGroup = 2;
                teacher = "Mr. Tom";
            } else if (gradeLevel == 3) {
                location = "Aquarium";
                numberOfGroup = 4;
                teacher = "Mr. Jerry";
            } else if (gradeLevel == 4) {
                location = "Movie";
                numberOfGroup = 2;
                teacher = "Mr. Vinnie";
            } else if (gradeLevel == 5) {
                location = "Cinema";
                numberOfGroup = 2;
                teacher = "Mr. Yo";
            } else { // grade level == 6;
                location = "Museum";
                numberOfGroup = 3;
                teacher = "Mr. Chi";
            }
                System.out.println("Field trip information for grade: " + gradeLevel);
                System.out.println("\tLocation is: " + location);
                System.out.println("\tNumber of group: " + numberOfGroup);
                System.out.println("\tTeacher is charge: " + teacher);

            } else {
                System.out.println("You grade must be 1 - 6");
            }
        }
    }

