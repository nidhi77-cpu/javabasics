/**
 * 
 */
package java_collection_project;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

/**
 * @author srinidhi.k
 *
 */
class Task {

	private String description;

	public Task(String description) {
		this.description = description;
	}

	public String getdescription() {
		return description;
	}




	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		  while (true) {
	            System.out.println("\nTask Manager Menu:");
	            System.out.println("1. Add Task");
	            System.out.println("2. Display Tasks");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 : 
			System.out.print("Enter task description: ");
        String description1 = sc.next();
        Taskmanger tm = new Taskmanger();
        tm.addtask(description1);
        break;
		}
		DEFAULT:
			System.out.println("nothing to disaply");
		break;

	}


	}
}
