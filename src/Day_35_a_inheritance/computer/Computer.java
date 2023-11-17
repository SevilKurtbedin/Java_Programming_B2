package Day_35_a_inheritance.computer;

public class Computer {
    String os;
    int memory;
    public Computer (String os, int memory) {
        this.os = os;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "\nComputer Info" +
                "\nOperation System: " + os +
                "\nMemory: " + memory;
    }
}
