/**
 * A prototype of the Bank class containing some of its features.
 * @Author: Nishith Savla (FCOG19146)
 */

import java.util.Scanner;

class BankAccount {

	private int accountNo;
	private String type;
	private int balance;
    static short count = 0;

    public BankAccount() {
        this.accountNo = ++count;
        this.balance = 1000;
        this.type = "SAVINGS";
    }

    public BankAccount(String type, int balance) {
		this.accountNo = ++count;
		this.type = type;
		this.balance = balance;
    }

    public BankAccount(int accountNo, String type, int balance) {
		this.accountNo = accountNo;
		this.type = type;
		this.balance = balance;
        ++count;
    }

	public void setAccountNo(int accountNo) {
    	this.accountNo = accountNo;
	}

	public int getAccountNo() {
    	return accountNo;
	}

	public void setType(String type) {
    	this.type = type;
	}

	public String getType() {
    	return type;
	}

	public int getBalance() {
    	return balance;

	}

	public boolean deposit(int amount) {
        if(amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
	}

    public boolean withdraw(int amount) {
        if(amount > 0 && isEnoughBalance(amount)) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    private boolean isEnoughBalance(int amount) {
        return (this.balance - amount) > 1000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account1 = new BankAccount("SAVINGS", 2000);
        String message;
        System.out.println("Initial balance: " + account1.getBalance());

        System.out.print("Enter the amount to deposit: ");
        message = account1.deposit(scanner.nextInt()) ? 
            "Deposit successful" : "Couldn't deposit, amount should be greater than 0";
        System.out.println(message);
        System.out.println("Current Balance: " + account1.getBalance());

        System.out.print("Enter the amount to withdraw: ");
        message = account1.withdraw(scanner.nextInt()) ? 
            "Withdraw successful" : "Couldn't withdraw, perhaps you don't have enough balance";
        System.out.println(message);
        System.out.println("Current Balance: " + account1.getBalance());
    }
}
