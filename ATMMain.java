import java.util.Scanner;

class BankAccount{
	private double balance;
	
	public BankAccount(double initialBalance){
		balance=initialBalance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public boolean withdraw(double amount){
		if(amount>balance){
			return false;
		}
		else{
			balance -= amount;
			return true;
		}
	}
	
	public void deposit(double amount){
		balance += amount;
	}
}


class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("Enter your Choice");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + account.getBalance());
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            account.deposit(amount);
            System.out.println("You have successfully deposited $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (account.withdraw(amount)) {
            System.out.println("You have successfully withdrawn $" + amount);
        } else {
            System.out.println("Insufficient funds. Transaction failed.");
        }
    }
}

public class ATMMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0); // Initial balance
        ATM atm = new ATM(account);
        System.out.println("Welcome to the ATM!");
        while (true) {
            atm.displayMenu();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}