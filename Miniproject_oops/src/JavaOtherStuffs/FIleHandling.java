/**
 * 
 */
package JavaOtherStuffs;
import java.io.*;
/**
 * @author srinidhi.k
 *
 */
public class FIleHandling {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     /* File f1 = new File("E:\\OneDrive - Yethi consulting Pvt Ltd\\Documents");
       if(f1.exists()) {
    	   f1.mkdir();
    	  
       }
       System.out.println("file created sucessfully");
	}*/
	
	// file writer and File Reading //
	
	FileWriter fw = new FileWriter("‪E:\\OneDrive - Yethi consulting Pvt Ltd\\Documents\\nidhi.txt");
	fw.write("hi guys writing some new stuffs");
	fw.flush();
	fw.close();

}
}