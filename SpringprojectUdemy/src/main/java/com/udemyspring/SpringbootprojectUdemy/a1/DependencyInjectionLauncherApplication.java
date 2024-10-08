/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.udemyspring.SpringbootprojectUdemy.GamingConfiguration;

/**
 * @author srinidhi.k
 *
 */
// @Component -->> to create the beans //
@Component
class Youbusinessclass {

	// 1. filed level setter depency injection //
	@Autowired
	Dependency1 dependency1;

	// constructor injection //
	@Autowired
	public Youbusinessclass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	public Dependency1 getDependency1() {
		return dependency1;
	}

	// 2.setter injection //
	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		this.dependency1 = dependency1;
	}

	public Dependency2 getDependency2() {
		return dependency2;
	}

	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		this.dependency2 = dependency2;
	}

	@Autowired
	Dependency2 dependency2;

	public String toString() {
		return "Using" + dependency1 + "and" + dependency2;
	}
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
class DependencyInjectionLauncherApplication {

	/*
	 * @Bean public GamingConsole game() { var game = new Packman(); return game; }
	 */

	/*
	 * @Bean public GameRunner
	 * gamerunner(@Qualifier("SupercontragameQualifier")GamingConsole game) {
	 * System.out.println("game :"+game); var gamrunner = new GameRunner(game);
	 * return gamrunner; }
	 */

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(Youbusinessclass.class));
		}
	}

}
