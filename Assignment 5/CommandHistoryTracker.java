import java.util.*;

public class CommandHistoryTracker {
    public static void main(String[] args) {
        int historyLimit = 3;
        Queue<String> history = new LinkedList<>();

        String[] commands = {"ls", "pwd", "cd ..", "mkdir"};

        for (String cmd : commands) {
            if (history.size() == historyLimit) {
                history.poll();
            }
            history.offer(cmd);
        }

        System.out.println("Recent Commands: " + history);
    }
}
