import java.util.*;

class EvenOddLocker {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Locker Number: ");
		int locker = sc.nextInt();
		
		if(locker%2==0){	
			System.out.println("Even Locker Number");
		}
		else{
			System.out.println("Odd locker Number");

		}
		
    }
}