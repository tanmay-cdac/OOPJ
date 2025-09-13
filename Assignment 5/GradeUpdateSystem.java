import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class GradeUpdateSystem {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();

        grades.put("Rohan", 78);
        grades.put("Rohan", 88);

        System.out.println("Updated Grade:");
        for (Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
