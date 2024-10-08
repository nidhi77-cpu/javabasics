/**
 * 
 */
package com.example.Spring.boot.Realtime.Project.Udemy.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author srinidhi.k
 *
 */

@Controller
@SessionAttributes(value="name")
public class Logincontroller {

	// http://localhost:8087/login
//	http://localhost:8087/login?name=srinidhi --->. query parmeter
	// model ---->>
	// src/main/webapp/WEB-INF/jsp/
	@Autowired
	private AuthenticateService authenticateService;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginman(@RequestParam String username, @RequestParam String password, ModelMap model) {
		// model.put("name", name);
		model.put("username", username);
		model.put("password", password);
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String welcomepage(@RequestParam String username, @RequestParam String password, ModelMap model) {

		
		// authentication check //
		if (authenticateService.autheicate(username, password)) {

			model.put("username", username);
			model.put("password", password);
			return "Welcome";
		}
		
		model.put("errormessage", "invalid creditnals mann");
		return "login";
	}
}
