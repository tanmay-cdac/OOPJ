
import java.util.Scanner;

public class AgeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String age = sc.nextLine();

        try{
            int a = Integer.parseInt(age);
            System.out.println("Age is : "+a);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Number Format");
        }
    }
}
