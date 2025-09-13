import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueRollNumberValidator {
    public static void main(String[] args) {
        Set<Integer> rollNo = new LinkedHashSet<>();

        rollNo.add(101);
        rollNo.add(102);
        rollNo.add(101);
        rollNo.add(103);

        System.out.println("Unique roll numbers: " + rollNo);
    }
}
