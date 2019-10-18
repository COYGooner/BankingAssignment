
public class CheckingAccount extends Accounts{
	private String protection; //which of the three protection is chosen
	private double total; //amount of money the account has
	private double limit; //overdraft limit
	
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}
	public boolean preconditionOfWithdrawAmount(int amount) {
		return total - amount >= 0;
	}
	
	public void withdrawAmount(int amount) {
		
	}
	
	public void depositAmount(int amount) {
		
	}
	
	public double getBalance() {
		return total;
	}
	
	public void setOverdraftOption(int option) {
		
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}

}
