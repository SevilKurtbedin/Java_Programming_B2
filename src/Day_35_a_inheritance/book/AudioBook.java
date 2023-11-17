package Day_35_a_inheritance.book;
// AudioBook is a Book
public class AudioBook extends Book {
    double duration; // mins
    String narrator;
    public void listen () {
        System.out.println("Listening to " + title + " narrated be " + narrator);
    }
}
