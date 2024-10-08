package understandopps;

public class Thirdclass implements Nidhi,Vishnuu {
	 static String name = "Nidhi";
	 // method overloading 
	public void add(int a, int b)
	{
		System.out.println("good u are at correct face");
	}
	public void add(int a, double b)
	{
		System.out.println("good u are at correct face");
	}
	public void add()
	{
		System.out.println("good u are at correct face");
	}
	public void add(int a, String name)
	{
		System.out.println("good u are at correct face");
	}
	public void print()
	{
		System.out.println("baddd brio");
	}

	public void show1()
	{
		Nidhi.super.show1();
		Vishnuu.super.show1();
	}
	public static void main(String[] args)
	   {
//	     String name = "Nidhi";
		// Thirdclass c = new Thirdclass();
//		 c.add(5);
//		 System.out.println(name);
		 //answer of multiple inhertiance and implemenation of interfaces
		Thirdclass c = new Thirdclass();
		c.show1();

		
		 
		
		 
	   }
}
