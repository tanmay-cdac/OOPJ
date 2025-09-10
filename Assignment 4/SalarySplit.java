import java.util.Scanner;

public class SalarySplit {
    public static void distributeBonus(int bonus, int employees){
        try{
            if(employees == 0){
                throw new ArithmeticException("Division by zero not allowed");
            }
            int share = bonus/employees;
            System.out.println("Each employee gets: "+ share);
        }
        catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bonus = sc.nextInt();
        int employees = sc.nextInt();

        distributeBonus(bonus, employees);
        sc.close();
    }
}
