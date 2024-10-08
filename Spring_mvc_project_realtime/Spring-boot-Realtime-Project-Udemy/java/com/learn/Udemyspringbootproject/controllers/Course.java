/**
 * 
 */
package com.learn.Udemyspringbootproject.controllers;

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
public class Course {
	
	// id , name , author //
	
	private Long id;
	private String name;
	private String author;

}
