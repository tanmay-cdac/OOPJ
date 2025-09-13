import java.util.*;

class StudentGrade {
    private String name;
    private String grade;

    public StudentGrade(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + ":" + grade;
    }
}

public class GradeBasedFilter {
    public static void main(String[] args) {
        List<StudentGrade> students = new ArrayList<>();
        students.add(new StudentGrade("Amit", "A"));
        students.add(new StudentGrade("Priya", "C"));
        students.add(new StudentGrade("Rohan", "B"));

        char minGrade = 'B';
        Iterator<StudentGrade> it = students.iterator();
        while (it.hasNext()) {
            StudentGrade s = it.next();
            if (s.getGrade().charAt(0) > minGrade) {
                it.remove();
            }
        }

        System.out.print("Qualified Students: ");
        for (StudentGrade student : students) {
            System.out.print(student + " ");
        }
    }
}
