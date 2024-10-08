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
@Primary
public class MySqlDataService implements DataService {

	@Override
	public int[] retrivedata() {
		// TODO Auto-generated method stub
		return new int[] { 1, 2, 3, 4, 5 };
	}

}
