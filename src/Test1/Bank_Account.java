package Test1;
public class Bank_Account {
	    private String accountNumber;
	    private double balance;
	    public Bank_Account(String accountNumber, double initialBalance) {
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
	            System.out.println("Invalid deposit amount.");
	        }
	    }
	    public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount.");
	        } else if (amount > this.balance) {
	            // Preventing withdrawal when amount exceeds available balance
	            System.out.println("Transaction Denied: Insufficient balance!");
	        } else {
	            this.balance -= amount;
	            System.out.println("Successfully withdrew: $" + amount);
	        }
	    }
	}

