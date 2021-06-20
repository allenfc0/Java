package lists;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stint = new Stack<Integer>();
		
		//Stack<String> stcSt = new Stack<String>();
		
		System.out.println(stint.isEmpty());
		//System.out.println(stint.pop());
		
		stint.push(1002);
		stint.push(1003);
		stint.push(1004);
		stint.push(1005);
		stint.push(1006);
		stint.push(1007);
		System.out.println(stint);
		
		stint.pop();
		System.out.println("after pop():" + stint);
		
		System.out.println(stint.search(1003));
		
		System.out.println(stint.peek());

	}

}
