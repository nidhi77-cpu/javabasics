package Exception;
// exception come at run time : unchecked exception  . eg:null pionter
// exception at compile time : checked execotion
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import wajjj.A;

public class Typesofexception {
// declared any varibale inside try then it can be accesed only inside the try itself
	public static void main(String[] args) {
		try
		{
		A a = null;
		a.x=20;
		System.out.println(a.x);
		}
		catch(Exception e)
		{
			System.out.println("bakwas");
			e.printStackTrace();
		}
//	  try {
//		FileInputStream f = new FileInputStream("d/ll");
//	} catch (FileNotFoundException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
//		try {
//			Thread.sleep(5);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
