package Day_33_a_Static_Intro;

public class UseSong {
    public static void main(String[] args) {
        Song s1 = new Song("AfroJack");
        Song s2 = new Song("AfroJack", 3.5);
        System.out.println(s1);
        System.out.println(s2);
        Song s3 = new Song("AfroJack", 3.5, "Party");
        Song s4 = new Song("AfroJack", 3.5, "Party", "DJ");
        System.out.println(s3);
        System.out.println(s4);
    }
}