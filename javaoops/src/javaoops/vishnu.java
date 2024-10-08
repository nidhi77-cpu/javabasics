package javaoops;

public class vishnu {

	
	public static void main(String [] args)
	{
		hari h = new hari();
   System.out.println(hari.page);
		h.name="sss";
		h.page=200;
		
		System.out.println(h.name);
		
		hari.lame="jjjj";
		System.out.println(hari.lame);
		
       hari h1= new hari();
		
		h1.name="ppp";
		h1.page=300;
		
		System.out.println(h1.name);
		System.out.println(h1.page);
		
		h=h1;
		System.out.println(h.name);
		change(10,20);
		
		
//		
//    hari h2 = null;
//		
//	     
//		System.out.println(h2.name);
//		
		
		
	}
	
	private static void change(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public  static void test(int views)
	{
	      int page=10;
	  	 page = page+ views;
		System.out.println(page) ;
	}
}
