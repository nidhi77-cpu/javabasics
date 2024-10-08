/**
 * 
 */
package com.example.Spring.boot.Realtime.Project.Udemy.login;

import org.springframework.stereotype.Service;

/**
 * @author srinidhi.k
 *
 */
@Service
public class AuthenticateService {
	
	public boolean  autheicate(String username , String password) {
		
		boolean isvalueusername = username.equalsIgnoreCase("is28minutes");
		boolean isvaluepassword = password.equalsIgnoreCase("dummy");
		
		return isvaluepassword && isvalueusername;
	}

}
