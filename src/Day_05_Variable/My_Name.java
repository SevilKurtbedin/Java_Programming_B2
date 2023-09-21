package Day_05_Variable;

public class My_Name {
    public static void main (String [] args) {
        char first = 'S';
        char second = 'e';
        char three = 'v';
        char four = 'i';
        char five = 'l';

        System.out.println(first);
        System.out.println(second);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);

        System.out.println(first+second+three+four+five);
        System.out.println("My name is "+first+second+three+four+five);

        String MyName = ("" +first+second+three+four+five);
        System.out.println("My name is "+MyName);
    }
}
