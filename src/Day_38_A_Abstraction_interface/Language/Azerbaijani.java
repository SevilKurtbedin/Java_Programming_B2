package Day_38_A_Abstraction_interface.Language;

public class Azerbaijani implements Language {


    @Override
    public void hi() {
        System.out.println("Salam");
    }

    @Override
    public void bye() {
        System.out.println("Gule gule");
    }
}