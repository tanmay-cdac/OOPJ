import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer ageObj = sc.nextInt();
        int age = ageObj;

        System.out.println("int value: " + age);

        sc.close();
    }
}
