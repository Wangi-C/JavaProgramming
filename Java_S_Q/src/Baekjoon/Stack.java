package Baekjoon;

import java.util.EmptyStackException;

public class Stack<T> {
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> top;
	private int stackSize = 0;
	
	public int empty() {
		if(top == null) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public void push(T num) {
		Node<T> node = new Node<T>(num);
		node.next = top;
		top = node;
		stackSize ++;
	}
	
	public int pop() {
		if (top == null) {
			return -1;
		}
		int item = (int)(top.data);
		top = top.next;
		stackSize --;
		return item;
	}
	
	public int size() {
		return stackSize;
	}
	
	public int top() {
		if(top == null) {
			return -1;
		}
		return (int)(top.data);
	}
}
