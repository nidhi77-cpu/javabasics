
public class Staticexamples {
	
	
	
	// global varibles :
	int actno=12345;
	String name = "Dinga";
	String branch = "basvangudi";
	double balance = 5000;
 	String type = "Savings";
 	double random;
 // global varibles :
 	//constant value
 	final double PI =3.142;
	
 	static String bankName = "ICICi";
	
	public  void deposit(int amt )
	{
		balance = PI+balance +amt;
	}
	
	public  void credit(int amt )
	{
		balance = balance - amt;
	}
	
	public void showbalance()
	{
		System.out.println("totalbalance"+ balance);
	}
	
	
	public void showAccount()
	{
	System.out.println("act no = "+actno);
	System.out.println("name = "+name);
	System.out.println("brnch = "+branch);
	System.out.println("balance = "+balance);
	System.out.println("acount type = "+type);
	System.out.println("acount type = "+bankName);
	}
	
	/*
	 * // local varibales // public void dummy() { int a=10; System.out.println(a);
	 * }
	 */
	
	
	
	public static void main(String [] args)
	{
		
	//	try {
		/*	Staticexamples sc = new Staticexamples();
			System.out.println(sc.a1);
			System.out.println(sc); // refernce varibles gives the address of the object :
			
			Staticexamples sc1 = sc;
		} catch (Exception e) {
			
		}
	}
*/
	}
}