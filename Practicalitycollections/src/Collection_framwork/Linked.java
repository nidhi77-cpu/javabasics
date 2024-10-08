package Collection_framwork;

import java.util.Collections;
import java.util.LinkedList;

public class Linked {
	
	static class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		
	}
    private Node head;
    
    
    
    public Linked()
    {
    	this.head = null;
    	
    }
	public void reverseList() {
	 if(head == null || head.next == null) {
         return;
     }
	}
	
	
	public void addFirst(int data) {
		
		 Node newNode = new Node(data , null);
		 newNode.next = head;
		 head = newNode;
		 

	}

	
	public static void main(String [] args) {
		LinkedList  ls = new LinkedList();
		/*
		 * ls.add("nidhi"); ls.add("nahsuha");
		 */
		/*
		 * for(String s : ls) { System.out.println(s); }
		 */
		
		
	   
	}
	
	
}
