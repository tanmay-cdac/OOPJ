import java.sql.SQLOutput;
import java.util.Scanner;

public class ExamScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentsCount = sc.nextInt();
        int arr[] = new int[studentsCount];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int studentNo = sc.nextInt();
        try{
            System.out.println(arr[studentNo]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Invalid index accessed");
        }

        sc.close();
    }
}
