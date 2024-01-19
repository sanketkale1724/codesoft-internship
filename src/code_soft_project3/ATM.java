package code_soft_project3;

import java.util.Scanner;

public class ATM {
	 private BankAccount account;
	    private Scanner scanner;

	    public ATM(BankAccount account) {
	        this.account = account;
	        this.scanner = new Scanner(System.in);
	    }

	    public void showMenu() {
	    	
	        
	        System.out.println("1. Check Balance");
	        System.out.println("2. Deposit");
	        System.out.println("3. Withdraw");
	        System.out.println("4. Exit");
	        System.out.println("********************");
	    }

	    public void run() {
	        int choice;
	        do {
	            showMenu();
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    deposit();
	                    break;
	                case 3:
	                    withdraw();
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	        } while (choice != 4);
	    }

	    private void checkBalance() {
	        System.out.println("Your current balance is: " + account.getBalance());
	    }

	    private void deposit() {
	        System.out.print("Enter the amount to deposit: ");
	        double amount = scanner.nextDouble();
	        account.deposit(amount);
	    }

	    private void withdraw() {
	        System.out.print("Enter the amount to withdraw: ");
	        double amount = scanner.nextDouble();
	        account.withdraw(amount);
	    }

}
