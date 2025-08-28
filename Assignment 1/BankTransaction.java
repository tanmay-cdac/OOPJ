import java.util.*;

class BankTransaction {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter transaction amount: ");
		int transaction = sc.nextInt();
		
		if(transaction>0){	
			System.out.println("Deposit transaction.");
		}
		else{
			System.out.println("Withdrawal transaction");

		}
		
    }
}