/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy.game;

/**
 * @author srinidhi.k
 *
 */
public class GameRunner {

	// tightly coupled class //
	
	public GamingConsole game;
	public GameRunner(GamingConsole game) {
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
