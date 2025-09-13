import java.util.ArrayList;
import java.util.List;

public class DailyTaskTracker {
    public static void main(String[] args) {
        List<String> task = new ArrayList<>();

        task.add("Study Java");
        task.add("Complete Assignment");
        task.add("Exercise");

        System.out.println("Initial Tasks: " + task);

        String completedTask = "Exercise";
        task.remove(completedTask);

        System.out.println("Remaining Tasks: " + task);
    }
}
