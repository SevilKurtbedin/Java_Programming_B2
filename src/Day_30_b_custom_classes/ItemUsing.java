package Day_30_b_custom_classes;

public class ItemUsing {
    public static void main(String[] args) {

    Item itemOne = new Item();
    itemOne.name = "Hat";
    itemOne.price = 89.99;
    System.out.println(itemOne);

        System.out.println("______________");

    Item itemTwo = new Item();
    itemTwo.name = "Water";
    itemTwo.price = 1.99;
    System.out.println(itemTwo);
    }
}