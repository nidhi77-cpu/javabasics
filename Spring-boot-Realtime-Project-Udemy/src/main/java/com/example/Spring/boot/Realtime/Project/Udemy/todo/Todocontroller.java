/**
 * 
 */
package com.example.Spring.boot.Realtime.Project.Udemy.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
/**
 * @author srinidhi.k
 *
 */

@Controller
public class Todocontroller {
	
	@Autowired
	private Todoservice todoservice;
	
	
	@RequestMapping("list-todos")
	public String listAlltodos(ModelMap model) {
		
	List<Todo> todos	=todoservice.findByUsername("in28minutes");
	model.addAttribute("todos", todos);
		
		return "listtodos";
	}

}
