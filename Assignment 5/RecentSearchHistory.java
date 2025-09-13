import java.util.ArrayDeque;
import java.util.Deque;

public class RecentSearchHistory {
    public static void main(String[] args) {
        Deque<String> history = new ArrayDeque<>();
        int Limit = 5;

        history.add("Java");
        history.add("Python");
        history.add("C++");
        history.add("DSA");
        history.add("OOP");
        history.add("Spring");

        System.out.println("Searches: "+history);
        while (history.size() > Limit) {
            history.pollFirst();
        }

        System.out.println("Recent searches: " + history);
    }
}
