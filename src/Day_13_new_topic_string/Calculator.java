package Day_13_new_topic_string;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.print("\nPick Operator: \n\t+\n\t-\n\t*\n\t/\n\t%\n\tEnter: ");
        String operator = input.next();
        boolean runOrNotRun = true;
        int result = 0;
        String message = "";

        switch (operator) {
            case "+": case "plus": case "Plus":
                result = num1 + num2;
                break;
            case "-": case "minus": case "Minus":
                result = num1 - num2;
                break;
            case "*": case "multiply": case "Multiply":
                result = num1 * num2;
                break;
            case "/": case "divide": case "Divide":
                result = num1 / num2;
                break;
            case "%": case "percent": case "Percent":
                result = num1 % num2;
                break;
            default:
                message = "Invalid Operator";
                runOrNotRun = false;
                break;
        }
        // if default is run, do not run this if statement.
        if (runOrNotRun) {
            System.out.println("\nYou entered numbers which are " + num1 + " and " + num2 +
                    "\nWith the operator you selected, the result is: " + result);
        } else {
            System.out.println(message);
        }
    }
}
