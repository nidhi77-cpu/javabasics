/**
 * 
 */
package Encapsulation;

/**
 * @author srinidhi.k
 *
 */
public class Account {
	
	
	private int accountnumber;
	private double balance;
	
	
	
	
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		if(accountnumber==1234)
		{
			System.out.println("account number is valid");
		}
		else
		{
			System.out.println("account number is invalid");
		}
		
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double amount) {
		if(amount>0)
		{
			System.out.println("then set the balance");
		}
		else
		{
			System.out.println("invalid balance");
		}
		
	}
	
	

}
