/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.udemyspring.SpringbootprojectUdemy.game.GameRunner;
import com.udemyspring.SpringbootprojectUdemy.game.GamingConsole;
import com.udemyspring.SpringbootprojectUdemy.game.Packman;

/**
 * @author srinidhi.k
 *
 */

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new Packman();
		return game;
	}

	@Bean
	public GameRunner gamerunner(GamingConsole game) {
		var gamrunner = new GameRunner(game);
		return gamrunner;
	}

}
