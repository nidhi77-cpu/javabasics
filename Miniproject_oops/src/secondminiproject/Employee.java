package secondminiproject;

import java.util.Scanner;

public class Employee extends Showroom implements Utility{
	
	public String empname;
	public int empage;
	
	
	public void getdetails()
	{
		
		System.out.println("enter empname"+empname);
		System.out.println("enter empage"+empage);
		System.out.println("enter showroomname"+ showroomname);
	}
	public void setdeatils()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee details");
		 System.out.println();
			
			System.out.println("enterempname");
			empname = sc.nextLine();
	        System.out.println("enterempage");
	        empage = sc.nextInt();
	        
	        System.out.println("enter showroomname");
	        showroomname = sc.nextLine();
	}

}