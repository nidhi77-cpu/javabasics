/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class User {
	
	//Properties: Name, ID, Email, Password
	//Methods: Getters and setters for properties
	
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public User(String name, int id, String email, String password) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int id;
	public String email;
	public String password;
	

}
