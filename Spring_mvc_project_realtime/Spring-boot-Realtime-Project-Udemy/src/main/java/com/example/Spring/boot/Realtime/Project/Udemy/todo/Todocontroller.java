/**
 * 
 */
package com.example.Spring.boot.Realtime.Project.Udemy.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
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

		List<Todo> todos = todoservice.findByUsername("in28minutes");
		model.addAttribute("todos", todos);

		return "listtodos";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String showtodos() {
		return "todos";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addtodos(String username,
			 String description,
			 LocalDate targetdate,
			 boolean done) {
		todoservice.addtodo(username, description, targetdate, false);
		return "redirect:list-todos";
	}

}
