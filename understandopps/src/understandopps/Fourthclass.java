package understandopps;

public class Fourthclass extends Thirdclass{
	
	public void print1()
	{
		System.out.println("good br");
	}
	@Override
	public void print()
	{
		System.out.println("good brio");
	}

	public static void main(String[] args) {
		

		 Fourthclass f = new  Fourthclass();
		
		 f.add(5,6);
		 f.print();
		 
		 // overriding
		 Thirdclass t = new Fourthclass();
		 t.print();
		 
		 // abstraction
		 Shape s = new Circle("nidhi",2.333);
		 s.area();
		 s.toString();
		 Shape s1 = new Rectangle("hari", 5.555, 6.6666);
		 s1.area();
		 s1.toString();
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
