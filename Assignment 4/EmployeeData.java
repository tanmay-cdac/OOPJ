import java.util.Scanner;
class Wage {
    public static void calculateHourlyWage(int[] arr, int hours, int empIndex) {
        try {
            int salary = arr[empIndex];
            try {
                int wage = salary / hours;
                System.out.println("Hourly wage: " + wage);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }
}
public class EmployeeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeCount = sc.nextInt();
        int[] arr = new int[employeeCount];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int hours = sc.nextInt();
        int empIndex = sc.nextInt();

        Wage.calculateHourlyWage(arr, hours, empIndex);
        sc.close();
    }
}
