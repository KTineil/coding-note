package algorithm;

import java.util.EmptyStackException;

class Stack<T> {
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	 private Node<T> top;
	 
	 public T pop() {
		 if (top == null) {
			 throw new EmptyStackException();
		 }
		 
		 T item = top.data;
		 top = top.next;
		 return item;
	 }
	 
	 public void push(T item) {
		 Node<T> t = new Node<T>(item);
		 t.next = top;
		 top = t;
	 }
	 
	 public T peek() {
		 return top.data;
	 }
	 
	 public boolean isEmpty() {
		 if (top == null)
			 return false;
		 return true;
	 }
}

public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		System.out.println(stack.isEmpty());
		stack.push(2);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		stack.pop();
	}
}
