import java.util.Stack;

public class BrowserHistoryManagement {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();

        history.push("Google");
        history.push("YouTube");
        history.push("GFG");

        if (!history.isEmpty()) {
            history.pop();
        }

        System.out.println("Current history:");
        for (String page : history) {
            System.out.println(page);
        }
    }
}
