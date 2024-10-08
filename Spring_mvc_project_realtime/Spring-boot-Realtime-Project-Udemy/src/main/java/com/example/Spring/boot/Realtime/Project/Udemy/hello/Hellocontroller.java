/**
 * 
 */
package com.example.Spring.boot.Realtime.Project.Udemy.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @author srinidhi.k
 *
 */

@Controller
public class Hellocontroller {
	
	@RequestMapping("/hellonidhis")
	@ResponseBody
	public String helloworld() {
		return "main how are u watsup";
	}
	
	@RequestMapping("/say-hello-jsp")
	@ResponseBody
	public String helloworldhtml() {
		return  "sayhello";
	}

}
