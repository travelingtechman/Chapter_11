package chapter_11;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		
		double amount = 0;
		double balance = 0.0;
		boolean loopEnd = true;
		SavingsAccount savings1 = new SavingsAccount(2,0.0);
		CheckingAcccount checking1 = new CheckingAcccount(1,0.0);
		
		//System.out.println(checking1.getBalance());
		//this.balance=balance;
		
		
		while(loopEnd == true) {
		System.out.println("Please enter a number to select an option, 1 is checking accounts, 2 is savings account, and 3 to exit the program");
		user = input.nextInt();
			if(user == 1) {
				System.out.println("please enter a 1 or 2, 1 for deposit, 2 for withdrawl");
					int user1 = input.nextInt();
				   		if (user1 == 1) {
				   			System.out.println("please enter an amount to deposit in your checkings account");
				   			amount = input.nextDouble();
				   			
				   			checking1.setBalance(checking1.Deposit(amount, checking1.getBalance()));
				   			System.out.println("your new balance is " + checking1.getBalance());
				   			
				   } else if(user1 == 2) {
					   System.out.println("please enter an amount to withdrawl");
					   amount = input.nextDouble();
					   checking1.setBalance(checking1.Withdraw(amount, checking1.getBalance()));
					   System.out.println("your new balance is " + checking1.getBalance());
				   }
				   		
			} else if(user == 2) {
				System.out.println("Please enter 1 to deposit, or 2 to withdraw");
				int user2 = input.nextInt();
				
				if(user2 == 1) {
					System.out.println("please enter an amount to deposit");
						amount = input.nextDouble();
						savings1.setBalance(savings1.Deposit(amount, savings1.getBalance()));
						System.out.println("your new balance is " + savings1.getBalance());
						
				} else if(user2 == 2) {
					System.out.println("Please enter an amount to withdraw");
						amount = input.nextDouble();
						savings1.setBalance(savings1.Withdraw(amount, savings1.getBalance()));
						System.out.println("your new balance is " + savings1.getBalance());
				} 
				
			} else if(user == 3) {
				break;
			}
		
		
	}
	}

}
