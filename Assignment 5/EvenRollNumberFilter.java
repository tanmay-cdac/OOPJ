import java.util.ArrayList;
import java.util.Iterator;

public class EvenRollNumberFilter {
    public static void main(String[] args) {
        ArrayList<Integer> rollNumbers = new ArrayList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        Iterator<Integer> iterator = rollNumbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println("Even Roll Numbers: " + rollNumbers);
    }
}
