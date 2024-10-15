public class Exercise11_3 {
	public static void main(String[] args){
		// checking account
		// withdraw would check against the overdraftLimit
		Account account1  = new Account(1, 100);
		CheckingAccount account2 = new CheckingAccount(1, 100);
		SavingsAccount account3 = new SavingsAccount(1, 100);
		System.out.println("Account " + account1.toString());
		System.out.println("Checking Account " + account2.toString());
		System.out.println("Savings Account " + account3.toString());
	}
}
