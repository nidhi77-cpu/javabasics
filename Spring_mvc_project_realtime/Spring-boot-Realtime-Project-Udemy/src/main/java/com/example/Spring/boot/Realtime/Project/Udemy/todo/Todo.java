/**
 * 
 */
package com.example.Spring.boot.Realtime.Project.Udemy.todo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author srinidhi.k
 *
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todo {
	
	/*
	 * id username description targetdate done
	 */
	
	private int id;
	private String username;
	private String description;
	private LocalDate targetdate;
	private boolean done;

}
