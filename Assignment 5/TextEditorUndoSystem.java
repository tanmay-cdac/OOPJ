import java.util.Stack;

public class TextEditorUndoSystem {
    public static void main(String[] args) {
        Stack<String> actions = new Stack<>();

        actions.push("Type A");
        actions.push("Type B");
        actions.push("Delete");

        if (!actions.isEmpty()) {
            actions.pop();
        }

        System.out.println("Current actions:");
        for (String action : actions) {
            System.out.println(action);
        }
    }
}
