class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    void setDetails(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println(accountHolder + " > Balance=" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println(accountHolder + " > Balance=" + balance + ", Interest=" + interest);
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    void checkOverdraft() {
        System.out.println(accountHolder + " > Balance=" + balance + ", Overdraft Limit=" + overdraftLimit);
    }
}

public class BankAccountTypes2 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.setDetails(101, "Ramesh", 5000);
        s.setInterestRate(5);
        s.calculateInterest();

        CurrentAccount c = new CurrentAccount();
        c.setDetails(102, "Anita", 2000);
        c.setOverdraftLimit(1000);
        c.checkOverdraft();
    }
}
