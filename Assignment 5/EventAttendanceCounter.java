import java.util.HashSet;
import java.util.Set;

public class EventAttendanceCounter {
    public static void main(String[] args) {
        Set<String> attendees = new HashSet<>();

        attendees.add("Amit");
        attendees.add("Rohan");
        attendees.add("Amit");
        attendees.add("Priya");

        System.out.println("Total unique attendees: " + attendees.size());
    }
}
