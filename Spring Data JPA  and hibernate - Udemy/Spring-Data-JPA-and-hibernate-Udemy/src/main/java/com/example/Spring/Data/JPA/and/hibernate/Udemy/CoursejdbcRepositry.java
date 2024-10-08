/**
 * 
 */
package com.example.Spring.Data.JPA.and.hibernate.Udemy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Spring.Data.JPA.and.hibernate.Udemy.course.Courses;

/**
 * @author srinidhi.k
 *
 */

@Repository
public class CoursejdbcRepositry {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	private static String INSERT_QUERY =
			
			"""
			
			insert into course(id, author, name)
			values(?, ?, ?);
			
			""" ;
	
private static String DELETE_QUERY =
			
			"""
			
			delete from course
			where id= ?;
			
			""" ;
	
	
	public void insert(Courses courses) {
		jdbcTemplate.update(INSERT_QUERY , courses.getId() ,
				courses.getAuthor() , courses.getName());
	}
	
	

	public void delete(long id) {
		jdbcTemplate.update(DELETE_QUERY ,id);
		
	}

}
