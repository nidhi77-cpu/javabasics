/**
 * 
 */
package com.example.Spring.Data.JPA.and.hibernate.Udemy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Spring.Data.JPA.and.hibernate.Udemy.course.Courses;

/**
 * @author srinidhi.k
 *
 */

@Component
public class Jdbccommandline implements CommandLineRunner {

	@Autowired
	CoursejdbcRepositry coursejdbcRepositry;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		coursejdbcRepositry.insert( new Courses (1l, "vayss" , "nidhi"));
		coursejdbcRepositry.insert( new Courses (2l, "vayss" , "nfffsfidhi"));
		coursejdbcRepositry.insert( new Courses (3l, "vayss" , "fsf"));
		coursejdbcRepositry.insert( new Courses (4l, "vayss" , "niafadhi"));
		
		coursejdbcRepositry.delete(1l);
	}

}
