/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy.game;

import org.springframework.stereotype.Component;

/**
 * @author srinidhi.k
 *
 */

@Component
public class MarioGame implements GamingConsole {

	
	
	public void up() {
		System.out.println("jump");
	}
	
	public void down() {
		System.out.println("go into hole");
	}
	public void left() {
		System.out.println("go back");
	}
	public void right() {
		System.out.println("Accelrate");
	}
}
