import java.util.Scanner;

public class SalaryStorage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        Double salaryObj = Double.valueOf(salary);

        System.out.println("Double object: " + salaryObj);
        sc.close();
    }
}

