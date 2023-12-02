package m1kllz.example;

public class BankAccount implements Interest {
    String name;
    int accountNumber;
    double balance;

    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void balanceInquiry() {
        System.out.println("Balance: $" + balance);
    }

    public void calculateInterest() {
        double interest = balance * rate;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }

}
