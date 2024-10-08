/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public  abstract class Vehicle implements Rentable {
	private int make;
	private String model;
	private String year ;
	
	// creating the constructor 
	
	public Vehicle(int make , String model , String year) {
		this.make=make;
		this.model=model;
		this.year = year;
		
	}
    
	public abstract void calculateRentalCost(int days);
}
