package chapter_11;

import java.util.Scanner;
import java.util.Date;
/**
 * @author ethan hunt
 * @Date 5/12/2022
 * 
 * savings account is an extension of the Account1 class and has overdraft fees for withdrawl
 */
public class CheckingAcccount extends Account1 {
	Scanner input = new Scanner(System.in);
	public final int id;
	double balance;
	Date dateCreated;
	double amountChange;
	
	CheckingAcccount(int id, double balance){
		super(id, balance);
		this.id = id;
		this.balance = balance;
		dateCreated = new java.util.Date();
	}
	@Override
	double Deposit(double amountChange,double balance) {
		this.amountChange = amountChange;
		this.balance = balance;
		//System.out.println("Please enter amount to deposit");
		//amountChange = input.nextDouble();
		balance = amountChange + balance;
		return balance; 
	}
	@Override
	//takes money out from balance and if negative amount is created adds a fee for overdraft
	double Withdraw(double amountChange,double balance) {
		this.amountChange = amountChange;
		this.balance = balance;	
		//checks if balance is negative or will be
		if( amountChange > balance) {
			System.out.println("amount withdrawl is greater then current balance, there will be a "
					+ "50 dollar overdraft fee");
			balance -= amountChange;
			balance -= 50;	
		} 
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
	//System.out.println("please enter ");
	
	

