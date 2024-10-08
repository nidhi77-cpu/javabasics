package secondminiproject;

import java.util.Scanner;

public class Showroom  implements Utility	{
	
	public String showroomname;
	public String showroomaddress;
	public String managername;
	public int totalemployees;
	public int totalnocarsinstock;
	
	
	
	
	
	
	
	

	@Override
	public void getdetails() {
		System.out.println("Showroomname" + showroomname );
		System.out.println("showroomaddress" + showroomaddress );
		System.out.println("managername" + managername );
		System.out.println("totalemployees" + totalemployees );
		System.out.println("totalnocarsinstock" + totalnocarsinstock );
		
	}

	@Override
	public void setdeatils() {
		//here we will input the details using the scanner class:
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^enter showrromdetails^^^^^^^^^^^^^");
        System.out.println();
		
		System.out.println("entershowroomname");
        showroomname = sc.nextLine();
        System.out.println("entershowroomaddress");
        showroomaddress = sc.nextLine();
        System.out.println("entermanagername");
        managername = sc.nextLine();
        System.out.println("entertotalemployees");
        totalemployees = sc.nextInt();
        System.out.println("entertotalnocarsinstock");
        totalnocarsinstock = sc.nextInt();
        
	}

}
