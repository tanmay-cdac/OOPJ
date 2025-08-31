class BankAccount {
    private String name;
	private double balance;
    private static double interestRate;
	
	static{
		interestRate = 4.0;
		System.out.println("Bank Interest Rate Initialized: " + interestRate +"%");
	}

	BankAccount(String name, double balance) {
        this.name = name;
		this.balance = balance;
    }
	
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
	
	public static double getInterestRate(){
		return interestRate;
	}
}

class BankAccountInitialization{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Rohit", 5000);
        BankAccount account2 = new BankAccount("Priya", 15000);
		
		System.out.println("Account 1: Name= "+account1.getName()+", Balance= "+account1.getBalance()+", Interest Rate="+account1.getInterestRate()+"%");
        System.out.println("Account 2: Name= "+account2.getName()+", Balance= "+account2.getBalance()+", Interest Rate="+account2.getInterestRate()+"%");
		
    }
}
