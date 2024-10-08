/**
 * 
 */
package com.example.Spring.Data.JPA.and.hibernate.Udemy.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author srinidhi.k
 *
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public  class Courses {

	@Id
	private Long id;
	@Column
	private String author;
	private String name;

}

