import java.util.HashMap;
import java.util.Map;

public class StudentGradeManagement {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Amit", 85);
        studentMarks.put("Priya", 92);
        studentMarks.put("Rohan", 78);

        System.out.println("Grade Report:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
