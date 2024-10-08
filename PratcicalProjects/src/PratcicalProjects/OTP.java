package PratcicalProjects;
import java.util.*;
public class OTP {
	
	  public static void main(String [] args)
	  {
		  int length;
		  System.out.println(geek_Password(10));
	  }
	  static char[] geek_Password(int len)
	  {
		 System.out.println("starting with the codeeeeee");
		 
		 
		 String captial = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String small = "abcdefghijklmnopqrstuvwxyz";
		 String numbers = "0123456789";
         String symbols = "!@#$%^&*_=+-/.?<>)";
         
         String values = captial+ small+ numbers+ symbols;
         
         Random rndm_method = new Random();
         
         char[] password = new char[len];
         
         for(int i=0; i<len ; i++)
         {
        	 password[i] =
                     values.charAt(rndm_method.nextInt(values.length()));
         
         }
         return password;
	  }

	  
	
}
