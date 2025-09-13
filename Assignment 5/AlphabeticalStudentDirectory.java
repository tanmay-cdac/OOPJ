import java.util.Set;
import java.util.TreeSet;

public class AlphabeticalStudentDirectory {
    public static void main(String[] args) {
        Set<String> students = new TreeSet<>();

        students.add("Rohan");
        students.add("Amit");
        students.add("Priya");

        System.out.println("Students: " + students);
    }
}
