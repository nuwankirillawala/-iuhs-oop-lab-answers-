public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Insuffiecient Balance");
            return;
        }

        this.balance -= amount;
    }

    public void displayAccountDetails() {
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }
}

// Result:
// Account number: 1234567890
// Balance: 10000.0
// Account number: 1234567890
// Balance: 5000.0
// Insufficient Balanace
// Account number: 9876543210
// Balance: 10000.0
