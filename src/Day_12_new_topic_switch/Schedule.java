package Day_12_new_topic_switch;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day is it and what it is about? ");
        String day = input.next();
        String result = "";

        switch (day) {
            case "Monday": case "Mon" : case "MONDAY":
                result = "Not classes for now, but it will be mentor sessions from 7PM - 10PM EST.";
                break;
            case "Tuesday": case "Tue" : case "TUESDAY" :
                result = "Not classes in this day.";
                break;
            case "Wednesday": case  "Wed" : case "WEDNESDAY" :
                result = "Class about Java Skills from 7PM - 10PM EST";
                break;
            case "Thursday": case "Thu" : case "THURSDAY" :
                result = "Class about Java Skills from 7PM - 10PM EST";
                break;
            case "Friday": case "Fri" : case "FRIDAY" :
                result = "Not classes in this day, just relax and ready for tomorrow";
                break;
            case "Saturday": case "Sat" : case "SATURDAY" :
                result = "Class about Java Skills from 9:30PM - 3PM EST with Feyruz";
                break;
            case "Sunday": case "Sun" : case "SUNDAY" :
                result = "Class about Soft Skills from 9:30PM - 3PM EST with Nadir";
                break;
            default:
                result = "Not valid day of week. Invalid!";
                break;
        }
        System.out.println(result);
    }
}
