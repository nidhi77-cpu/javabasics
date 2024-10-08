/**
 * 
 */
package java_collection_project;

import java.util.ArrayList;

/**
 * @author srinidhi.k
 *
 */
public class Taskmanger {

	private ArrayList<Task> taskList;

	public Taskmanger() {
		taskList = new ArrayList<>();

	}

	public void addtask(String description) {
		Task myTask = new Task(description);
		taskList.add(myTask);
	}

}
