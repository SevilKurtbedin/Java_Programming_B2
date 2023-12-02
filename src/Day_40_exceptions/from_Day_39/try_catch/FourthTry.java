package Day_40_exceptions.from_Day_39.try_catch;

public class FourthTry {
    public static void main(String[] args) {

        try {
            System.out.println("Start");
            Thread.sleep(-2000);
            System.out.println("Finish");


        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
