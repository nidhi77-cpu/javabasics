/**
 * 
 */
package JavaOtherStuffs;

import java.io.*;

/**
 * @author srinidhi.k
 *
 */
public class Serlaization {

	String name;
	int id;
	
	public  Serlaization(String name , int id) {
		this.name = name;
		this.id = id;
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		  Serlaization sc = new Serlaization("nidhi", 2); FileOutputStream fout = null;
		 
		File file = new File("E:\\OneDrive - Yethi consulting Pvt Ltd\\\\Documents\\nidhi.txt");

		
		  file.createNewFile();
		  
		  fout = new FileOutputStream(file); ObjectOutputStream out = new
		  ObjectOutputStream(fout); out.writeObject(out);
		 
		
		  file.createNewFile(); 
		  fout = new FileOutputStream(file); // creating output  byte stream
		  ObjectOutputStream out1 = new ObjectOutputStream(fout);// object   stream
		 out.writeObject(out1); // used to convert java object into stream of
		//  bytes and // make it to transfer0
		 
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(fis);
		Object ob = in.readObject();
		Serlaization sce = (Serlaization) ob;
		System.out.println(sce.id);
		System.out.println(sce.name);
		    
		
		
	}

}