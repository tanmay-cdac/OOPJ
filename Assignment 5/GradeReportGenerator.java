import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class GradeReportGenerator {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new LinkedHashMap<>();

        studentGrades.put("Amit", 85);
        studentGrades.put("Priya", 92);

        System.out.print("Grade Report: ");

        Iterator<Entry<String, Integer>> iterator = studentGrades.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Integer> entry = iterator.next();
            System.out.print(entry.getKey() + ":" + entry.getValue());
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
    }
}
