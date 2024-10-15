public class SavingsAccount extends Account {
	SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	double overdraftLimit = 0;
	
	@Override
	public String toString() {
		return super.toString() + " Overdraft limit: $" + overdraftLimit;
	}
}
	