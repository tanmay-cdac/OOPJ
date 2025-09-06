class Account {
    int accountNo;
    double balance;

    void setDetails(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void display() {
        System.out.println(accountNo + ", Balance=" + balance);
    }
}

class SavingAccount extends Account {
    double interestRate;

    void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    void display() {
        System.out.println("Saving = " + accountNo + ", Balance=" + balance + ", Interest=" + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void display() {
        System.out.println("Current = " + accountNo + ", Balance=" + balance + ", Overdraft=" + overdraftLimit);
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.setDetails(101, 5000);
        s.setInterestRate(5);
        s.display();

        CurrentAccount c = new CurrentAccount();
        c.setDetails(102, 10000);
        c.setOverdraftLimit(2000);
        c.display();
    }
}
