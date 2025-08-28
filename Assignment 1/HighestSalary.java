import java.util.*;

class HighestSalary {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary for Company 1: ");
		int salary1 = sc.nextInt();
		System.out.print("Enter salary for Company 2: ");
		int salary2 = sc.nextInt();
		System.out.print("Enter salary for Company 3: ");
		int salary3 = sc.nextInt();
		
		if(salary1>=salary2 && salary1>=salary3){	
			System.out.println("Company 1 offers the highest salary.");
		}
		else if (salary2>=salary1 && salary2>=salary3){
			System.out.println("Company 2 offers the highest salary.");
		}
		else{
			System.out.println("Company 3 offers the highest salary.");

		}
		
    }
}