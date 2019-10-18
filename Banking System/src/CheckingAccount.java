
public class CheckingAccount extends Accounts{
	private String protection; //which of the three protection is chosen
	private double total; //amount of money the account has
	private double limit; //overdraft limit
	
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public void withdrawAmount(int amount) {
		if(total>=amount)
		{
		  total -= amount; 
		}
		else
		{
		  overdraft();
		}
	}
	
	public void overdraft() {
		total -= 5;
	}
	
	public void MouthlyFixFee() {
		total -= 4;
	}
	
	public void depositAmount(int amount) {
		total += amount; 
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
