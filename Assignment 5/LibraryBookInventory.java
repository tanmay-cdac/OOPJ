import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LibraryBookInventory {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new LinkedHashMap<>();

        inventory.put("Java", 3);
        inventory.put("Python", 5);

        String borrowedBook = "Java";
        int borrowCount = 1;

        if (inventory.containsKey(borrowedBook)) {
            int currentCopies = inventory.get(borrowedBook);
            inventory.put(borrowedBook, currentCopies - borrowCount);
        }

        System.out.println("Current inventory:");
        for (Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
