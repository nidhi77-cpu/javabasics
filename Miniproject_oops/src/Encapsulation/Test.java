/**
 * 
 */
package Encapsulation;

/**
 * @author srinidhi.k
 *
 */


public class Test {
	
	private int accountnumber;
	public Test(int accountnumber, int accountbalance) {
		super();
		this.accountnumber = accountnumber;
		this.accountbalance = accountbalance;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}
	private int accountbalance;
	
	
	public int depositmoney(int accountbalance) {
		
		if(accountbalance>100) {
			System.out.println("eligbile to depoit some stuffs");
		}
		return accountbalance-1000;
		
		
	}
	public int withdrawMoney() {
		return accountbalance;
	
		
	}
	public int checkBalance() {
		return accountbalance;
		
		
	}

}