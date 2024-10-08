/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Mainclass {
	
	
	
	public static void main (String [] args)
	{
		
	// constructors
	Staticexamples s = new Staticexamples();
	Constructors c = new Constructors("nidhi" , 100);
	
	s.showbalance();
	s.deposit(5000);
	s.showbalance();
	s.credit(1000);
	s.showbalance();
	 s.showAccount();
	//  s.dummy();
	  System.out.println(s.random);
      //has a realtion
	  Email e = new Email("nidhi","java", "codewell");
	  e.openMail();
	  e.a1.showDetails();
	  //has a realtion
	  
	  //inhertiane
	  Subclass sv = new Subclass(10);
	  sv.display();
	  sv.test();
	  System.out.println(sv.x1);
	  
	  Superclass supers = new Superclass(10);
	  supers.addtest();
	  
	  sv.addtest();
	  
	  //abstract class stuff//
	  Savings s1 = new Savings();
	  s1.getaccountstmnt();
	  s1.createaccount();
	  
	  //interface stuff
      Run rs = new Testing();
      System.out.println(rs.a);
      
      //interface stuffs//
      
      Credit c1 = new Credit();
    //  Swipe.swipe(c1);
	  
	}
}
