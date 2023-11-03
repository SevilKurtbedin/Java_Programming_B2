package Day_29_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        statusShoppingList(shoppingList);
        aksToAddItems(shoppingList);
        showListItem(shoppingList);
        System.out.println("List has item? " + hasItem(shoppingList, "apple"));
        System.out.println("List has item? version 2.0 - " + hasItem(shoppingList));
        removeItem(shoppingList, 2);
        showListItem(shoppingList);

    }
    public static void removeItem (ArrayList <String> list, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println(index + " is out of range");
        }
    }
    //TODO:  Ask a user what index to remove if it is in the list range
    public static void removeItem (ArrayList <String> list ) {



    }
    public static boolean hasItem (ArrayList <String> list, String item) {
        return list.contains(item);
    }
    // Ask a user, what item to check if it is in the list;
    //TODO: Ask a user what item if it is in the list
    public static boolean hasItem (ArrayList <String> list) {
        Scanner input = new Scanner(System.in);
        String item = input.nextLine();
        System.out.println("Are you have " + item + "?");
        if (list.contains(item)) {
            return true;
        }
            return false;
    }
    public static void showListItem (ArrayList <String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "\t" + list.get(i));
        }
    }
    public static void statusShoppingList (ArrayList <String> list) {
        if (list.isEmpty()) {
            System.out.println("Shopping List Empty!");
        } else {
            System.out.println("Shopping List has Item!");
        }
    }
    // This is doing the same this as above
    // System.out.println( list.isEmpty() ? "Shopping List Empty!" :"Shopping List has Items!" );
    public static void aksToAddItems (ArrayList <String> list) {
        Scanner input = new Scanner(System.in);
        String userDecision = "";
        do {
            System.out.print("Enter the item: ");
            list.add(input.nextLine());

            System.out.print("Do you want add more? (Yes/Not): ");
            userDecision = input.nextLine(); // Yes, or Not

        } while (userDecision.equalsIgnoreCase("y") || userDecision.equalsIgnoreCase("Yes"));
        System.out.println(list);
    }
}
