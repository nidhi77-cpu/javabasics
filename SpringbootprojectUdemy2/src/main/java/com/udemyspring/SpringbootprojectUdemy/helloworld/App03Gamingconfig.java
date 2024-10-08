/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemyspring.SpringbootprojectUdemy.GamingConfiguration;
import com.udemyspring.SpringbootprojectUdemy.game.GameRunner;
import com.udemyspring.SpringbootprojectUdemy.game.GamingConsole;

/**
 * @author srinidhi.k
 *
 */
public class App03Gamingconfig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(var context =
			new	AnnotationConfigApplicationContext(GamingConfiguration.class)){
		
		context.getBean(GamingConsole.class).up();
		
		context.getBean(GameRunner.class).run();
		}
	}

}
