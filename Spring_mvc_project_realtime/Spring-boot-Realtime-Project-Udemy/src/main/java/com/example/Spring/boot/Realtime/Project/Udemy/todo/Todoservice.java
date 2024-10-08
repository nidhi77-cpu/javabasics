/**
 * 
 */
package com.example.Spring.boot.Realtime.Project.Udemy.todo;
import java.time.LocalDate;
import java.util.*;

import org.springframework.stereotype.Service;
/**
 * @author srinidhi.k
 *
 */
@Service
public class Todoservice {
	
	private static List<Todo> todos = new ArrayList();
	/* id username description targetdate done */
	
	private static  int todoscount =0;
	static {
		todos.add(new Todo(todoscount++,"nidhi","coding guys", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(todoscount++,"nidhi","coding guys", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(todoscount++,"nidhi","coding guys", LocalDate.now().plusYears(3), false));
		todos.add(new Todo(todoscount++,"nidhi","coding guys", LocalDate.now().plusYears(4), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
   
	public void addtodo( String username,
	 String description,
	 LocalDate targetdate,
	 boolean done)
	{
		 Todo todo = new Todo(todoscount++ , username , description , targetdate , done);
	}
}
