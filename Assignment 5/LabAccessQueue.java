import java.util.LinkedList;
import java.util.Queue;

public class LabAccessQueue {
    public static void main(String[] args) {
        Queue<String> lab = new LinkedList<>();

        lab.add("Amit");
        lab.add("Priya");
        lab.add("Rohan");

        System.out.println("Initial Queue: " + lab);

        lab.poll();

        System.out.println("Queue after processing: " + lab);
    }
}
