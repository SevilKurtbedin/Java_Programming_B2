package Day_11_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        int myPincode = 1234;
        int mySSN = 8213;
        /*
inputs:
    declare and assign a 4 digit pin code
    declare and assign the last 4 digits of ssn: 1234

    declare and assign expected values for both
        example expected:
            pin: 1552
            ssn: 1234

outputs:

        when the pincode and ssn match the expected print:
            Authentication successful

        when the pincode or ssn are not correct print:
            Authentication failed

        when the pincode was not correct print:
            incorrect pin code

        when the ssn is not correct print:
            invalid ssn
 */
        Scanner input = new Scanner(System.in);
        System.out.print("\tWelcome to ATM!\nPlease, enter your pin-code: ");
        int enteredPinCOde = input.nextInt();
        System.out.print("Please, enter las 4 digits of your SSN: ");
        int enteredSSN = input.nextInt();

        if (enteredPinCOde == myPincode && enteredSSN == mySSN) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed!");
            if (enteredPinCOde != myPincode) {
                System.out.println("Invalid pin-code");
            }
            if (enteredSSN != mySSN) {
                System.out.println("Invalid SSN");
            }
        }
    }
}