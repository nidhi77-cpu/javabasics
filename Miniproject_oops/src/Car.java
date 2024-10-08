/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Car extends Vehicle{

	public Car(int make, String model, String year) {
		super(make, model, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		// writing the logic here to implment the rental cost of the car :
		int rentalcost = 30;
		while (days>0)
		{
			rentalcost = rentalcost*30;
			System.out.println(rentalcost);
			return;
		}
	}

}
