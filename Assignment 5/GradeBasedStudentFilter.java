import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class GradeBasedStudentFilter {
    public static void main(String[] args) {
        Map<String, Integer> grades = new LinkedHashMap<>();

        grades.put("Amit", 85);
        grades.put("Priya", 52);
        grades.put("Rohan", 78);

        int threshold = 60;
        Iterator<Entry<String, Integer>> iterator = grades.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < threshold) {
                iterator.remove();
            }
        }

        System.out.println("Honor Roll:");
        for (Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
