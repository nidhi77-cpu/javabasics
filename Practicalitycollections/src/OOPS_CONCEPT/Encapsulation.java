/**
 * 
 */
package OOPS_CONCEPT;

/**
 * @author srinidhi.k
 *
 */
public class Encapsulation {
	
	
	public Encapsulation(int accountnumber, String accountname) {
		super();
		this.accountnumber = accountnumber;
		this.accountname = accountname;
	}




	private int accountnumber;
	public int getAccountnumber() {
		return accountnumber;
	}




	public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
	}




	public String getAccountname() {
		return accountname;
	}




	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}




	private String accountname;
	
	  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Encapsulation en = new Encapsulation(10, "nidhi");
       en.setAccountname("hari");
       System.out.println("new account name has been setedup");
       System.out.println(en.getAccountname());
       
       
       
	}

}
