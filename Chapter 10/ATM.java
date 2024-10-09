import java.util.Date;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		Account[] accountArray = new Account[10];
		for(int i = 0; i < accountArray.length; i++){
			accountArray [i] = new Account(i, 100);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an id: ");
		int id = input.nextInt();
		if (0 <= id && id <= 10){
			System.out.println("Main menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
		} 
		else {
			System.out.print("Invalid id");
		}
		
		
		System.out.print("\nEnter a choice: ");
		int choice = input.nextInt();
		
		while (choice != 5){
		if (choice == 1){
			double balance = accountArray[id].getBalance();
			System.out.print("The balance is " + balance);
		}
		if (choice == 2){
			System.out.print("Enter an amount to withdraw: ");
			double withdraw = input.nextDouble();
			accountArray[id].withdraw(withdraw);
			
		}
		if (choice == 3){
			System.out.print("Enter an amount to deposit: ");
			double deposit = input.nextDouble();
			accountArray[id].deposit(deposit);
			
		}
		if (choice == 4){
			System.out.print("Enter an id: ");
			id = input.nextInt();
			if (0 <= id && id <= 10){
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
			} 
			else {
				System.out.print("Invalid id");
			}
			System.out.print("\nEnter a choice: ");
			choice = input.nextInt();
			
		}
		System.out.print("\nEnter a choice: ");
		choice = input.nextInt();
	}
}
}
class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	Account() {
	}
	
	Account(int id, double balance) {
		id = id;
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
		//double withdraw = 0;
		balance = balance - amount;
		return balance;
	}
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
}