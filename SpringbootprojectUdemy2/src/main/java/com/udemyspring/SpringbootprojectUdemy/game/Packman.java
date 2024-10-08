/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy.game;

/**
 * @author srinidhi.k
 *
 */
public class Packman  implements GamingConsole{

	@Override
	public void up() {
		System.out.println("uping in packman");
		
	}

	@Override
	public void down() {
		System.out.println("downing in packman");
		
	}

	@Override
	public void left() {
		System.out.println("left in packman");
	}

	@Override
	public void right() {
		System.out.println("right in packman");
		
	}

}
