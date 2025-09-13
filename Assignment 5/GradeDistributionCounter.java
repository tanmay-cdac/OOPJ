import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GradeDistributionCounter {
    public static void main(String[] args) {
        String[] grades = {"A", "B", "A", "C", "B", "A"};
        Map<String, Integer> distribution = new HashMap<>();
        for (String grade : grades) {
            distribution.put(grade, distribution.getOrDefault(grade, 0) + 1);
        }

        System.out.println("Grade Distribution:");
        for (Entry<String, Integer> entry : distribution.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
