package Test1;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Creating Account ---");
        BankAccount myAccount = new BankAccount("ACC-12345", 500.00);
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + myAccount.getBalance());
        System.out.println("\n--- Testing Deposits ---");
        myAccount.deposit(150.00);
        System.out.println("Current Balance: $" + myAccount.getBalance());
        System.out.println("\n--- Testing Valid Withdrawal ---");
        myAccount.withdraw(200.00);
        System.out.println("Current Balance: $" + myAccount.getBalance());
        System.out.println("\n--- Testing Insufficient Funds Prevention ---");
        myAccount.withdraw(600.00); 
        System.out.println("Final Account Balance: $" + myAccount.getBalance());
            }
}
class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = (initialBalance >= 0) ? initialBalance : 0;
    }
    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Error: Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Invalid withdrawal amount.");
        } else if (amount > this.balance) {
            System.out.println("Transaction Denied: Insufficient balance!");
        } else {
            this.balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        }
    }
}
