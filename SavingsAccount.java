package chapter_11;

import java.util.Scanner;
import java.util.Date;

public class SavingsAccount extends Account1 {
	Scanner input = new Scanner(System.in);
	public final int id;
	double balance;
	Date dateCreated;
	double amountChange = 0;
	
	SavingsAccount(int id, double balance){
		super(id, balance);
		this.id = id;
		this.balance = balance;
		
		
	}
	@Override
	double Deposit(double amountChange,double balance) {
		this.amountChange = amountChange;
		this.balance = balance;
		//System.out.println("Please enter amount to deposit");
		//amountChange = input.nextDouble();
		balance += amountChange;
		return balance; 
	}
	@Override
	double Withdraw(double amountChange, double balance) {
		this.amountChange = amountChange;
		this.balance = balance;
		//System.out.println("please enter amount to withdraw");
		//amountChange = input.nextDouble();
		if( amountChange > balance) {
			System.out.println("amount withdrawl is greater then current balance, please try an amount that"
					+ " is less then the total of your balance");
			amountChange = input.nextDouble();
			
		}
			balance -= amountChange;
		
		return balance;
	}
	@Override
	public double getBalance() {
		 return balance;
	 }
	@Override
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
