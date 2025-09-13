import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class AttendanceTrackingSystem {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new TreeMap<>();

        attendance.put("Amit", 90);
        attendance.put("Rohan", 85);
        attendance.put("Priya", 95);

        System.out.println("Attendance Report:");
        for (Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

