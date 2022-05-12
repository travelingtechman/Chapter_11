package chapter_11;

import java.util.Date;

public class Account1{
	double balance = 0.0;
	double annualinterestRate = 0.0;
	int id = 0;
	Date dateCreated;
	Account1(){
		
	}
 Account1(int id, double balance ){
	 this.balance = balance;
	 this.id = id;
 } 
 Account1(int id, double balance, double annualinteristRate){
	 this.balance = balance;
	 this.id = id;
	 annualinterestRate = annualinteristRate;
	 dateCreated = new java.util.Date();
 }
 Account1(Date dateCreated){ 
	 dateCreated = new java.util.Date();
 }
 //gets the monthly interest rate by dividing the annual interest rate
 double getMonthlyInterestRate(double annualinterestRate) {
	 return (annualinterestRate/12);
 }
 //gets the monthly interest amount
 double getMonthlyInterest(double annualinterestRate, double balance){ 
	 return ((balance*getMonthlyInterestRate(annualinterestRate))/100);
 }
 //return the new balance after withdrawal is made
double Withdraw(double amount, double balance) {
	balance -= amount;  
	 return balance;
 }
//adds to the balance
 double Deposit(double amount, double balance) {
	 balance += amount;
	 return balance;
 }
 public double getBalance() {
	 return balance;
 }
 public void setBalance(double balance) {
		this.balance = balance;
	}
 }