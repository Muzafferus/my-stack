public class Main {
	public static void main(String[] args) {
		 
		 MyStack<Integer> stack = new MyStack();
		 		 
		 stack.push(2005);
		 stack.push(2007);
		 stack.push(2009);
		 
		 System.out.println("My stack list: " + stack);
		 
		 System.out.println("Last stack element: " + stack.peek());
		 System.out.println("My stack list: " + stack);
			 
		 System.out.println("Last stack element (with delete): " + stack.pop());
		 System.out.println("My stack list: " + stack);
		 
		 
		System.out.println("Search 2010: " + stack.search(2010));
		System.out.println("Search 2005: " + stack.search(2005));	
	}
}
