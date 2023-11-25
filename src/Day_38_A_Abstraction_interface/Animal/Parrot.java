package Day_38_A_Abstraction_interface.Animal;


import Day_38_A_Abstraction_interface.Language.Language;

public class Parrot extends Bird implements Flyable, Language {
    public void eat(){
        System.out.println("Parrots each with their beaks");
    }

    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("HI HI");
    }

    @Override
    public void bye() {
        System.out.println("BYE BYE");
    }
}