class BankAccount {
    private double balance;

    BankAccount() {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
	public void withdraw(double amount) {
		if(balance>=amount){
		balance -= amount;
		}
		else{
			System.out.println("Cannot withdraw insufficient balance");
		}
	}
	
	public double getBalance(){
		return balance;
	}
}

public class BankAccountProtection {
    public static void main(String[] args) {
        BankAccount ac = new BankAccount();
		ac.deposit(5000);
		ac.withdraw(2000);
		System.out.println("Update Balance = "+ac.getBalance());
    }
}
