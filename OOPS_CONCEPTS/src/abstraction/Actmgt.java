package abstraction;

public class Actmgt {
	
	public static Account creatAct(char type)
	{
		Account a1;
		
		
		if(type=='S')
		{
			a1 = new Savings();
			return a1;
		}
		else
		{
			a1 = new Fd();
			return a1;
		}
	}
	
	
	

}
