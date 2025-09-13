import java.util.ArrayDeque;
import java.util.Deque;

public class TicketBookingQueue {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();

        queue.add("Amit");
        queue.add("Priya");
        queue.add("Rohan");

        String servedCustomer = queue.poll();

        System.out.println("Serving: " + servedCustomer);
        System.out.println("Queue: " + queue);
    }
}
