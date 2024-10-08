/**
 * 
 */
package Collection_framwork;

import java.util.Stack;

/**
 * @author srinidhi.k
 *
 */
public class Stacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// stack is lifo //
		/*
		 * Stack<Integer> stack = new Stack<>(); stack.push(1); stack.push(2);
		 * stack.push(3); stack.push(4); while(!stack.isEmpty()) {
		 * System.out.println(stack.peek()); stack.pop(); }
		 */
		
		// problem to push the one stack to bottom //
		
		// problem to reverse the stack// 
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
	//	pushToBottom(stack , 4);
		reverse(stack);
		
		 while(!stack.isEmpty()) {
	            System.out.println(stack.pop());
	        }
		
	}

	private static void reverse(Stack<Integer> stack) {
		
		if(stack.isEmpty()) {
		return;
		}
		
		int top = stack.pop();
		reverse(stack);
		pushToBottom(stack, top);
		
		
	}

	private static void pushToBottom(Stack<Integer> stack, int i) {
		
		if(stack.isEmpty()) {
			stack.push(i);
			return;
		}
		int temp = stack.pop();
		pushToBottom(stack, i);
		stack.push(temp);

		
	}

}
