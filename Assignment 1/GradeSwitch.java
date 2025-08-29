import java.util.*;

class GradeSwitch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0–100): ");
        int marks = sc.nextInt();

        String grade = switch (marks / 10) {
            case 10, 9, 8 -> "A"; 
            case 7 -> "B";        
            case 6 -> (marks >= 55) ? "C" : "D"; 
            case 5, 4 -> (marks >= 45) ? "D" : "E"; 
            case 3, 2 -> "E";   
            case 1, 0 -> "F";     
            default -> "Invalid Marks!";
        };

        System.out.println("Grade: " + grade);
    }
}
