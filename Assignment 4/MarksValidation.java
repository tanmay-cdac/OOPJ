import java.util.Scanner;

public class MarksValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        try{
            if(marks>=1 && marks<=100){
                System.out.println("You got "+marks+" marks");
            }
            else {
                throw new Exception("Invalid marks");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
