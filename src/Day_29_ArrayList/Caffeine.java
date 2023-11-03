package Day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList <String> drinks = new ArrayList<>();
        System.out.println(drinks.size());
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drinks");
        drinks.add("soda");
        System.out.println(drinks);
        ArrayList <String> drinks2 = new ArrayList<>(drinks);
        System.out.println(drinks2);
        String [] allDrinks = {"cola", "monster", "red bull", "gorilla"};
        ArrayList <String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks));
        System.out.println(drinks3);
        ArrayList <String> drinks5 = new ArrayList<>(Arrays.asList("Water", "Dovga", "Ayran"));
        System.out.println(drinks5);
        drinks.addAll(drinks5);
        drinks.addAll(Arrays.asList("Caprisone", "Su", "Voda"));
        System.out.println("___________________________");
        System.out.println(drinks);
        System.out.println("___________________________");
        drinks.addAll(0,Arrays.asList("Fanta", "Sprite", "Canada Dry" ));
        ShoppingList.showListItem(drinks);
        ShoppingList.removeItem(drinks, 0);
        System.out.println("________________________");
        System.out.println(drinks);
    }
}
