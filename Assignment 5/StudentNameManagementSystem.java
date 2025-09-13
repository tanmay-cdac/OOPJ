import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentNameManagementSystem {

    public static void main(String[] args) {
        List<String> studentRoster = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            studentRoster.add("Amit");
            studentRoster.add("Priya");
            studentRoster.add("Rohan");

            System.out.println("Student Names: " + studentRoster);
            String studentToRemove = "Priya";
            if (studentRoster.contains(studentToRemove)) {
                studentRoster.remove(studentToRemove);
                System.out.println(studentToRemove + " removed from the class.");
            } else {
                System.out.println("Error: Student not found in class.");
            }

            System.out.println("Final Student names: " + studentRoster);

        } catch (Exception e) {
            System.out.println("An error occurred while managing student names: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
