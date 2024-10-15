import java.util.Date;
public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	Account() {
	}
	
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
//id accessor and mutator	
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = (newId >= 0) ? newId : 0;
	}
	
//balance accessor and mutator
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		balance = (newBalance >= 0) ? newBalance : 0;
	}
	
//annualInterestRate accessor and mutator
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = (newAnnualInterestRate >= 0) ? newAnnualInterestRate : 0;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = (annualInterestRate / 100) /12;
		return monthlyInterestRate;
	}
	public double getMonthlyInterest(double monthlyInterestRate) {
		double monthlyInterest = monthlyInterestRate * balance;
		return monthlyInterest;
	}
	
	public double withdraw(double amount) {
		balance = balance - amount;
		return balance;
	}
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
	
	public String toString(){
		return "Created on " + dateCreated + " Id: " + id + " Balance: $" + balance; 
	}
}
