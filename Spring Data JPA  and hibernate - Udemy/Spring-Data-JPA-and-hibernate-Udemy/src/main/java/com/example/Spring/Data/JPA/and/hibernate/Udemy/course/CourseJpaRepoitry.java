/**
 * 
 */
package com.example.Spring.Data.JPA.and.hibernate.Udemy.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * @author srinidhi.k
 *
 */

@Repository
public class CourseJpaRepoitry {

	
	@PersistenceContext
	EntityManager entityManager;
	
	public void insert(Courses courses) {
		entityManager.merge(courses);
	}
	
	public Courses findById(long id) {
		return entityManager.find(Courses.class, id);
	}
	
	public void deleteByid(Courses courses) {
		//Courses coursess = entityManager.find(Courses.class, id);
	}
	
}
