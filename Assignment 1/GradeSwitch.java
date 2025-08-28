import java.util.*;

class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        String grade;
        switch (marks / 10) {
            case 10, 9, 8, 7 -> grade = "A";
            case 6 -> grade = "B";           
            case 5 -> grade = "C";           
            case 4 -> grade = "D";          
            case 3, 2 -> grade = "E";        
            default -> grade = "F";          
        }

        System.out.println("Grade: " + grade);
    }
}
