import java.util.LinkedHashSet;
import java.util.Set;

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Set<String> courses = new LinkedHashSet<>();

        courses.add("CS101");
        courses.add("MA101");
        courses.add("CS101");

        System.out.println("Registered Courses: " + courses);
    }
}
