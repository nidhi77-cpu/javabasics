package oopsdpth;

//honda- child class
//car - parent class
public class HondaCar extends cardriver
{
    public void HondCar()
    {
    	System.out.println("goo outt");
    }
	public void gps()
	{
		System.out.println("next level");
	}
	 public void bowl(int size)
	 {
		 System.out.println("bowl correctly  " + bowl);
		 
		bowl= bowl+size;
		 System.out.println("bowl correctly  " + bowl);
		
	}
	 @Overriden
	 public void bowl()
	 {
		 System.out.println("bowl");
	 }
}


