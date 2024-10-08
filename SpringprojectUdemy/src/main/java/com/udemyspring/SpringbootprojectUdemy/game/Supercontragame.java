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
@Qualifier("SupercontragameQualifier")
public class Supercontragame implements GamingConsole {

	public void up() {
		System.out.println("jump up");
	}
	
	public void down() {
		System.out.println("down");
	}
	public void left() {
		System.out.println("left shift");
	}
	public void right() {
		System.out.println("right shift ");
	}

}
