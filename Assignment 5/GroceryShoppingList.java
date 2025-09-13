import java.util.ArrayList;
import java.util.List;

public class GroceryShoppingList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Milk");
        list.add("Eggs");
        list.add("Bread");

        System.out.println("Add items: "+list);

        String purchased = "Milk";
        if(list.contains(purchased)){
            list.remove(purchased);
        }
        System.out.println("Items to buy: "+list);
    }
}
