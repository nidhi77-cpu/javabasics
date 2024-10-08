package javaoops;

public class points {
	
	 int x;
	 int y;
	
	public static void main(String []  args)
	{
		points p = new points();
		p.x=100;
		p.y=200;
		System.out.println(p.x+"----"+ "isgood");
		System.out.println();
		p.change(200,300);
	//	System.out.println(p.x);
	//	System.out.println(p.y);
	}
	
    public  void change(int a , int b)
    {
      this.x=a;
      this.y=b;
      
     // System.out.println(this.x);
}
    public void increment( points p , int b)
    {
    	p.x= p.x+p.y;
    	
    }
    public void sanple(int x, int y)
    {
    	this.x=x;
    	System.out.println(this.x);
    }
}
