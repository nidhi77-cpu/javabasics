/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Motorcycle extends Vehicle {

	public Motorcycle(int make, String model, String year) {
		super(make, model, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateRentalCost(int days) {
		int rentalcost = 20;
		while (days>0)
		{
			rentalcost = rentalcost*10;
			System.out.println("the total rental cost of motorcycle"+rentalcost);
			return;
		}
		
	}

}