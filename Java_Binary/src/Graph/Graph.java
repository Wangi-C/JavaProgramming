package Graph;

import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	class Node{
		int data;
		LinkedList<Node> adjacent; //���� ������
		boolean marked; //�湮�ߴ��� ��ŷ
		
		public Node(int data) {
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}
	Node[] nodes; //������ ������ �迭
	public Graph(int size) {
		nodes = new Node[size];
		for(int i = 0; i < size; i++) {
			nodes[i] = new Node(i);
		}
	}
	
	public void addEdge(int i1, int i2) {
		Node n1 = nodes[i1];
		Node n2 = nodes[i2];
		if(!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
	}
	
	public void visit(Node r) {
		System.out.println(r.data + " ");
	}
	
	public void dfs() {
		dfs(0);
	}
	
	public void dfs(int index) {
		Node root = nodes[index];
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		root.marked = true;
		while(!stack.isEmpty()) { //������ �����Ͱ� ���������� �ݺ� 
			Node r = stack.pop();
			for(Node n : r.adjacent) {
				if(n.marked == false) { //���ÿ� �߰����� ���� ���鸸 �߰�
					n.marked = true;
					stack.push(n);
				}
			}
			visit(r);
		}
	}
	
	public void bfs() {
		bfs(0);
	}
	
	public void bfs(int index) {
		Node root = nodes[index];
		Queue<Node> q = new Queue<Node>();
		q.enqueue(root);
		root.marked = true;
		while(!q.isEmpty()) {
			Node r = q.dequeue();
			for(Node n : r.adjacent) {
				if(n.marked == false) {
					n.marked = true;
					q.enqueue(n);
				}
			}
			visit(r);
		}
	}
	
	public void dfsR(Node r) { //���ȣ���� ���� dfs�����
		if(r == null) return;
		r.marked = true;
		visit(r);
		for(Node n : r.adjacent) {
			if(n.marked == false) {
				dfsR(n);
			}
		}
	}
	
	public void dfsR(int index) {
		Node r = nodes[index];
		dfsR(r);
	}
	
	public void dfsR() {
		dfsR(0);
	}
}
