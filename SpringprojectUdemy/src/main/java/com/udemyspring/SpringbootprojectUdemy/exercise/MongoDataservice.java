/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy.exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author srinidhi.k
 *
 */


@Component

public class MongoDataservice implements DataService {

	@Override
	public int[] retrivedata() {
		// TODO Auto-generated method stub
		return new int[] { 11, 22, 33, 44, 55 };
	}

}