/*Last In First Out*/

package StackQueue;

public class Stack<T> {
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> top;
	
	public T pop() {
		try {
			T item = top.data;
			top = top.next;
			return item;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
	}
	
	public T peek() {
		try {
			return top.data;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}