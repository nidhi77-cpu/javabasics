/**
 * 
 */
import java.util.*;
/**
 * @author srinidhi.k
 *
 */
public class User {
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public void setPassword(String password) {
		this.password = password;
	}
	private String username;
	public User(String username, String address, String email, String password) {
		super();
		this.username = username;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	private  String address;
	private String email;
	private String password;
	
  
	
	public void useraccount() {
		
	}
	
	public void login(String ) {
		
	}
	
	public void logout() {
		
	}
}
