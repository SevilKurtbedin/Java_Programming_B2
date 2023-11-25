package Day_39_a_polymorphism.book;

public class Library {
    public static void main(String[] args) {
        JavaTextBook book1 = new JavaTextBook();
        book1.name = "Java Programming";
        book1.size = 20.0;
        book1.isFun = true;

        book1.read();
        book1.open();
        book1.download();

        System.out.println();

        EBook book2 = new JavaTextBook();
        book2.name = "Java P-2";
        book2.size = 25.0;
        ((JavaTextBook)book2).isFun = false;
        book2.read();
        book2.open();
        book2.download();

        System.out.println();

        Book book3 = new JavaTextBook();
        book3.name = "Java P-3";
        ((JavaTextBook)book3).size = 30.0;
        ((JavaTextBook)book3).isFun = true;

        book3.read();
        ((JavaTextBook) book3).open();
        ((JavaTextBook) book3).download();

        Downloadable book4 = new JavaTextBook();
        /*
        book4.name = "Java P-4";
        book4.size = 35.0;
        book4.isFun = true;
        book4.read();
        book4.open();
         */
        book4.download();

        System.out.println();

        JavaTextBook book5 = (JavaTextBook)book4;
        book5.name = "Java Script";
        book5.size = 40.0;
        book5.isFun = false;
        book5.read();
        book5.open();
        book5.download();
        JavaTextBook book6 = new JavaTextBook();
    }
}
