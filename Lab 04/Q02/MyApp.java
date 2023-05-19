public class MyApp {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 0);

        account.deposit(10000);
        account.displayAccountDetails();

        account.withdraw(5000);
        account.displayAccountDetails();
        account.withdraw(8000);

        BankAccount anotherAccount = new BankAccount("9876543210", 0);
        anotherAccount.deposit(10000);
        anotherAccount.displayAccountDetails();
    }
}
