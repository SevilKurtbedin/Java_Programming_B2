package Day_36_inheritance.lyft;

public class Lyft {
    String driver;


    public Lyft (String driver) {
        this.driver = driver;
    }



    public double calculateRate (int miles){
        return miles * 1.75;
    }
}
