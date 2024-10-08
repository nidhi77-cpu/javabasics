/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author srinidhi.k
 *
 */

// record was installed in java 16//
record Person(String getname, int getage, Address address) {
};

record Address(String firstline, String city) {
};

// address -- first line and city //

// @Primary : these annations can be used to avoid the multiple beans // which specifies which one
// is most important .

// @ Qualifier can laso be used //

@Configuration
public class Helloworlsconfiguration {

	@Bean
	public String getname() {
		return "nidhi";
	}

	@Bean
	public int getage() {
		return 15;
	}

	@Bean

	public Person person() {
		var person = new Person("hari", 29, new Address("khcross", "karnatka"));
		return person;
	}

	@Bean(name = "address2")
	public Address address() {
		var Address = new Address("raguvanhalli", "bengaluru");
		return Address;

	}

	@Bean
	public Person person2personcall() {
		return new Person(getname(), getage(), address());
	}
}
