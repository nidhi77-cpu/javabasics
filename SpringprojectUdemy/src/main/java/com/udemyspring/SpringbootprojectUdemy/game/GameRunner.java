/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author srinidhi.k
 *
 */

@Component
public class GameRunner {

	// tightly coupled class //
	
	public GamingConsole game;
	public GameRunner(@Qualifier("SupercontragameQualifier")GamingConsole game) {
		this.game= game;
	}
	public void run() {
		System.out.println("game has been started " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
