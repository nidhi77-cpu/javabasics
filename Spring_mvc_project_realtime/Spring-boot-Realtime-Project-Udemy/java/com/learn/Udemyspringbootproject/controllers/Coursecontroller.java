/**
 * 
 */
package com.learn.Udemyspringbootproject.controllers;
import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author srinidhi.k
 *
 */

@RestController
public class Coursecontroller {

	
	@RequestMapping("/courses")
	public List<Course> retriveAllcourse(){
		return Arrays.asList(
				
				new Course(1l, " nidhi" , "hariivayu"),
				new Course(1l, " hari" , "hariivayussss"),
				new Course(1l, " amma" , "appa")
				
				
				
				);
				
	}
}
