package Enscapulation;

public class Accounts {
	
	private int actno =1234;

	/*
	 * public int getActno() { return actno; } public void setActno(int actno) {
	 * this.actno = actno; }
	 */
	private double bal;
	
	public double getBal(int actno) {
		if(actno==1234)
		{
			return bal;
			
		}
		else
		{
			return -777;
		}
	}
	public void setBal(double amt) {
		if(amt>0)
		{
			bal = bal+amt;
		}
	}

}
