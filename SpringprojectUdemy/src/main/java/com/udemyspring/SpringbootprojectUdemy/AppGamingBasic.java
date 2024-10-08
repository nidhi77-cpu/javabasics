
/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy;

import com.udemyspring.SpringbootprojectUdemy.game.GameRunner;
import com.udemyspring.SpringbootprojectUdemy.game.MarioGame;
import com.udemyspring.SpringbootprojectUdemy.game.Packman;
import com.udemyspring.SpringbootprojectUdemy.game.Supercontragame;

/**
 * @author srinidhi.k
 *
 */
public class AppGamingBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		var MarioGame = new MarioGame();
		var Supercontragame = new Supercontragame();
		var Packman = new Packman(); // object creation //
		var GameRunner = new GameRunner(MarioGame); // object creation + wiring the depnedcies
		GameRunner.run();

	}

}
