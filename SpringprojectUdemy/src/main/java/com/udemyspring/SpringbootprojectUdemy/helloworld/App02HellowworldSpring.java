/**
 * 
 */
package com.udemyspring.SpringbootprojectUdemy.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author srinidhi.k
 *
 */
public class App02HellowworldSpring {

	public static void main(String[] args) {
		// launch a spring context
		try (var context = new AnnotationConfigApplicationContext(Helloworlsconfiguration.class)) {
			// configure the things that we want spring to manage // @Configuration //

			// Bean - name

			// 3.retrving the beans managed by the spring //

			System.out.println(context.getBean("getname"));

			System.out.println(context.getBean("getage"));

			System.out.println(context.getBean("person"));

			System.out.println(context.getBean("address2"));

			System.out.println(context.getBean("person2personcall"));

			System.out.println("next printing the stuffs");

			System.out.println(context.getBean(Address.class));

			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}

	}

}
