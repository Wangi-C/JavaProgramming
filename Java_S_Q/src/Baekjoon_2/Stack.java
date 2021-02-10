package Baekjoon_2;

public class Stack<T> {
	private Node<T> top;
	private int stackSize = 0;
	
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	public void push(T data) {
		Node<T> node = new Node<T>(data);
		node.next = top;
		top = node;
		stackSize ++;
	}
	
	public void pop() {
		if(top == null) {
			System.out.println("No");
		}else {
			top = top.next;
			stackSize --;
		}
	}
	
	public int size() {
		return stackSize;
	}
}
