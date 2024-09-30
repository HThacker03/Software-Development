import java.util.Date;
public class AccountTest {
	public static void main(String[] args) {
		Account newAccount = new Account(1122, 20000);
		newAccount.setAnnualInterestRate(4.5);
		double mrate = newAccount.getMonthlyInterestRate();
		double monthly = newAccount.getMonthlyInterest(mrate);
		double balance = newAccount.getBalance();
		balance = balance + newAccount.deposit() - newAccount.withdraw();
		
		System.out.println("Account Balance: " + balance);
		System.out.println("The monthly interest is: " + monthly);
		System.out.println("Date account created: " + newAccount.getDateCreated());
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
	
	public double withdraw() {
		double withdraw = 2500;
		return withdraw;
	}
	public double deposit() {
		double deposit = 3000;
		return deposit;
	}
}
