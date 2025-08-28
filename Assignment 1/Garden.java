import java.util.*;

class Garden {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		int length = sc.nextInt();
		System.out.print("Enter breadth: ");
		int breadth = sc.nextInt();
		if(length==breadth){	
			System.out.println("Square Garden");
		}
		else{
			System.out.println("Rectangular Garden");

		}
		
    }
}