import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentRegistrationOrderTracker {
    public static void main(String[] args) {
        Map<String, Integer> registrations = new LinkedHashMap<>();

        registrations.put("Amit", 101);
        registrations.put("Rohan", 102);
        registrations.put("Priya", 103);

        System.out.println("Registration Order:");
        for (Entry<String, Integer> entry : registrations.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
