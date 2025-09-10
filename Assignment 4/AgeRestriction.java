import java.util.Scanner;

public class AgeRestriction {
    public static void ageException(int age) throws Exception{
            if (age < 18) {
                throw new Exception("AgeNotValidException: Age must be >= 18 ");
            }
            System.out.println("Allowed");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try{
            ageException(age);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
