/**
 * 
 */
package JavaOtherStuffs;

/**
 * @author srinidhi.k
 *
 */
// handling the trhreading class with respect to FUnctional Interface//
public class Threading implements Runnable
{

	public static void main(String[] args) {
		System.out.println("program starts");
		Runnable r1 = () -> {
			System.out.println("executing task one");
		};

		Runnable r2 = () -> {
			System.out.println("executing task two");
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
		
		System.out.println("program ends");
	}
	/*
	 * Every Thread will have three property - Name - id - priority
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}