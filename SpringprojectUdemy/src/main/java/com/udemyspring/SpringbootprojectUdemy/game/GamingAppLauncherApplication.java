/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.udemyspring.SpringbootprojectUdemy.GamingConfiguration;

/**
 * @author srinidhi.k
 *
 */

@Configuration
@ComponentScan("com.udemyspring.SpringbootprojectUdemy.game")
public class GamingAppLauncherApplication {

	/*
	 * @Bean public GamingConsole game() { var game = new Packman(); return game; }
	 */

	@Bean
	public GameRunner gamerunner(@Qualifier("SupercontragameQualifier")GamingConsole game) {
		System.out.println("game :"+game);
		var gamrunner = new GameRunner(game);
		return gamrunner;
	}
	
	public static void main(String[] args) {
		try(var context =
			new	AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
		
		context.getBean(GamingConsole.class).up();
		
		context.getBean(GameRunner.class).run();
		}
	}

}
