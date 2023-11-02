package Day_28_ArrayList;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList <String> group = new ArrayList<>();
        group.add("Sevil");
        group.add("Nihad");
        group.add("Feyruz");
        group.add(0,"Nadir");
        System.out.println(group);
        System.out.println(group.get(2));
        group.add("Parvanna");
        System.out.println(group);
    }
}
