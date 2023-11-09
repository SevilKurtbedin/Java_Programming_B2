package Day_31_custom_classes;

public class Carpet {
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet(boolean inputIsPersian, double inputWidth, double inputLength,
                  double inputUtilPrice) {
        width = inputWidth;
        length = inputLength;
        isPersian = inputIsPersian;
        unitPrice = inputUtilPrice;
    }

    public void calculatePrice() {
        totalPrice = width * length * unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }
    }

    @Override
    public String toString() {
        if (isPersian) {
            return "\t*~*~*~* The carpet is Persian *~*~*~*\t" +
                    "\nHas dimensions width = " + width +
                    " x " + length +
                    "\nUnit price $" + unitPrice +
                    "\nTotal Price $" + totalPrice;
        } else {
            return "\t*~*~*~* The carpet *~*~*~*\t" +
                    "\nHas dimensions width = " + width +
                    " x " + length +
                    "\nUnit price $" + unitPrice +
                    "\nTotal Price $" + totalPrice;
        }
    }
}
