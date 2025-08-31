class BankAccount {
	private String holderName;
    private int balance;

	BankAccount(String holderName, int balance) {
		this.holderName = holderName;
		this.balance = balance;
    }
	
	public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class BankAccountBasic{
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount("Sahil", 50000);
		
		System.out.println("Account 1: Holder Name= "+bank1.getHolderName()+", Balance= "+bank1.getBalance());		
    }
}
