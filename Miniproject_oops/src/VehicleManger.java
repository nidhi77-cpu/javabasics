/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class VehicleManger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car c = new Car(2, "AUDI", "2020");
       Motorcycle mr = new Motorcycle(7, "HIMALAYAN", "2023");
       
       c.calculateRentalCost(10);
      
       mr.calculateRentalCost(7);
      
	}

}