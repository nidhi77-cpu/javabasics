/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */


public class FunctionalInterfaces implements MyFunctionalInterface{

	/**
	 * @param args
	 */
	
	public static void main(String [] args) {
	/*FunctionalInterface fs = new FunctionalInterface();
	fs.addnum();

	}

	@Override
	public void addnum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addsub() {
		// TODO Auto-generated method stub
		
	}
	static void addbakwas() {
		
	}*/
   
		MyFunctionalInterface ms = () -> "software Engineer";
		System.out.println(ms.getname());
			
		

	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
