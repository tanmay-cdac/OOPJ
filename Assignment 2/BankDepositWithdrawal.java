class BankAccount {
	private String holderName;
    private double balance;
	private double amount;
	BankAccount(String holderName, double balance) {
		this.holderName = holderName;
		this.balance = balance;
    }
	
	public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
	public void deposit(double amount){
		this.balance = balance + amount;
		System.out.println(amount+" Amount added to balance");
	}
	public void withdraw(double amount){
		this.balance = balance - amount;
		System.out.println(amount+" Amount deducted from balance");
	}
}

class BankDepositWithdrawal{
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount("Sahil", 50000);
		BankAccount bank2 = new BankAccount("Abhishek", 30000);
		System.out.println("Account 1: Holder Name= "+bank1.getHolderName()+", Balance= "+bank1.getBalance());
		bank1.deposit(10000);
		System.out.println("Account 1: Holder Name= "+bank1.getHolderName()+", Balance= "+bank1.getBalance());
		System.out.println("Account 2: Holder Name= "+bank2.getHolderName()+", Balance= "+bank2.getBalance());
		bank2.withdraw(2000);
		System.out.println("Account 2: Holder Name= "+bank2.getHolderName()+", Balance= "+bank2.getBalance());
    }
}
