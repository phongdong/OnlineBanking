package onlinebanking.Account;

public class Account {
	private long id;
	private double checkingAmount = 0;
	private double savingAmount = 0;
	
	public double getCheckingAmount() {
		return checkingAmount;
	}
	public void setCheckingAmount(double checkingAmount) {
		this.checkingAmount = checkingAmount;
	}
	public double getSavingAmount() {
		return savingAmount;
	}
	public void setSavingAmount(double savingAmount) {
		this.savingAmount = savingAmount;
	}

	public Account(double checkingAmount, double savingAmount) {
		this.checkingAmount += checkingAmount;
		this.savingAmount += savingAmount;
	}
	public void deposit(double checkingAmount, double savingAmount) {
		this.checkingAmount += checkingAmount;
		this.savingAmount += savingAmount;
	}
	
	public void withdraw(double checkingAmount, double savingAmount) {
		if (checkingAmount > 0 && checkingAmount <= this.checkingAmount) {
			this.checkingAmount -= checkingAmount;
		}
		if (savingAmount > 0 && checkingAmount <= this.savingAmount) {
			this.savingAmount -= savingAmount;
		}
	}
}
