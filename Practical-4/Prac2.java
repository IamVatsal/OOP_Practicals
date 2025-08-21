public class Prac2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Vatsal", "24012011142", 1000.0);
        System.out.println("\nInitial account balance:");
        account.displayBalance();
        account.deposit(500.0);
        account.displayBalance();
        account.withdraw(200.0);
        account.displayBalance();
    }
}
class BankAccount{
    String accountHolderName;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("\nDeposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("\nWithdrew: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + this.balance);
    }
}