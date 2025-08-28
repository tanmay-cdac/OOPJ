import java.util.*;

class EmployeeBonus {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary: ");
		int salary = sc.nextInt();
		System.out.print("Enter years of service: ");
		int years = sc.nextInt();
		if(years>5){	
			System.out.println("Bonus amount: "+(salary/20));
		} 
		else{
			System.out.println("No Bonus");
		}
		
    }
}