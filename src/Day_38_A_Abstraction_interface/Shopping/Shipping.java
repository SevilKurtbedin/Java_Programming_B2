package Day_38_A_Abstraction_interface.Shopping;

// Interface - we cannot instantiate / cannot create object
// all variables are - > public static final
// the methods by default is - > public abstract
public interface Shipping {

    String COUNTRY = "US"; // public static final

    void payForShipping (boolean b); // public abstract


}