/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy.exercise;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.udemyspring.SpringbootprojectUdemy.game.GamingAppLauncherApplication;

/**
 * @author srinidhi.k
 *
 */

@Component
class Business {

	/*
	 * @Autowired DataService dataService; // field level dependecy injection //
	 */

	private DataService dataService;

	@Autowired
	public Business(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrivedata()).max().orElse(0);
	}
}

@Configuration
@ComponentScan
class BusinessClassService {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(BusinessClassService.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(Business.class).findMax());

		}

	}

}