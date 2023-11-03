package Day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {
        ArrayList <String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET", "DEV", "PO", "CEO", "DEVOP", "QA", "BA", "SM", "PM", "SH", "Team Lead",
                "Client", "Domain Expert", "SME"));
        System.out.println("Original job Titles: " + allJobs);
        ArrayList <String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("SM", "BA", "Client"));
        System.out.println("After removeAll: " + jobs1);

        System.out.println("_______________________________________________________________________________________");

        ArrayList <String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET", "QA", "DEV"));
        System.out.println("After retainAll: " + jobs2);

        System.out.println("_______________________________________________________________________________________");

        ArrayList <String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3);
        System.out.println(jobs3.containsAll(Arrays.asList("SDET", "PM", "SME")));
        System.out.println(jobs3.containsAll(Arrays.asList("Doctor", "PM", "SME"))); // true : false

    }
}
