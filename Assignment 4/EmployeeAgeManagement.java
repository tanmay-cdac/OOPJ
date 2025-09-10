import java.util.Scanner;

public class EmployeeAgeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        Integer ageObj = age;

        System.out.println("Integer object: " + ageObj);

        sc.close();
    }
}
