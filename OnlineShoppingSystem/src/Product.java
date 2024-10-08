/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Product {

	
	
	private String name;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCateogry() {
		return cateogry;
	}


	public void setCateogry(String cateogry) {
		this.cateogry = cateogry;
	}


	public String getQuantityinstocks() {
		return quantityinstocks;
	}


	public void setQuantityinstocks(String quantityinstocks) {
		this.quantityinstocks = quantityinstocks;
	}


	private int price;
	private String cateogry;
	private String quantityinstocks;
	
	
	public Product(String name , int price , String cateogry , String quantityinstocks) {
		this.name = name;
		this.price = price;
		this.cateogry = cateogry;
		this.quantityinstocks = quantityinstocks;
	}
	
	
}
