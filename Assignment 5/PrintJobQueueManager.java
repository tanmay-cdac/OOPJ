import java.util.*;

public class PrintJobQueueManager {
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();

        printQueue.add("Doc1");
        printQueue.add("Doc2");
        printQueue.add("Doc3");

        System.out.println("Initial Queue: " + printQueue);

        if (!printQueue.isEmpty()) {
            String currentJob = printQueue.poll();
            System.out.println("Printing " + currentJob + ", Queue: " + printQueue);
        }
    }
}
