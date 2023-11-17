package Day_35_a_inheritance.book;
// EBook is a Book
public class EBook extends Book {
    int pages;
    public void read () {
        System.out.println("Reading a digital copy of " + title + " which has " + pages + " pages.");
    }
}
