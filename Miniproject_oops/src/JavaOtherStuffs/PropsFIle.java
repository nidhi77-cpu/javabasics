/**
 * 
 */
package JavaOtherStuffs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author srinidhi.k
 *
 */
public class PropsFIle {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
         
		
		// proprties we are creating one text file and stroing //
		// properties is nothing but the has table //
		Properties p1 = new Properties();
		String path = "E:\\OneDrive - Yethi consulting Pvt Ltd\\Documents\\AUSFBCARDS.txt";

		/*
		 * p1.setProperty("username", "password"); p1.setProperty("nidhi", "1234");
		 * 
		 * FileOutputStream fos = new FileOutputStream(path); p1.store(fos, path);
		 * System.out.println("FIle created");
		 */
		
	    // proprties file where we will load and fetch the stuff //
		
		FileInputStream fis = new FileInputStream(path);
		p1.load(fis);
		String us = p1.getProperty("username");
		String ps = p1.getProperty("nidhi");
        System.out.println(us);
        System.out.println(ps);
		
		
		
		

	}

}
