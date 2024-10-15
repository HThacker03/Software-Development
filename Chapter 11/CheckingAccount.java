class CheckingAccount extends Account {
	CheckingAccount(int id, double balance) {
		super(id, balance);
	}
	double overdraftLimit = 50;
	
	@Override
	public String toString() {
		return super.toString() + " Overdraft limit: $" + overdraftLimit;
	}
}
	