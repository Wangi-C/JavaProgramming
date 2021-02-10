package BinaryTree;

public class Tree {
	public Node root;
	
	public void setRoot(Node node) {
		this.root = node;
	}
	
	public Node getRoot() {
		return root;
	}
	
	public Node makeNode(int data, Node left, Node right) {
		Node node = new Node(data, left, right);
		return node;
	}
	
	public void inorder(Node node) { // left - root - right
		if (node != null) { //node가 null이 아닐때까지 재귀호출
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}
	
	public void preorder(Node node) { // root - left - right
		if(node != null) {
			System.out.println(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void postorder(Node node) { // left - right - root
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.data);
		}
	}
}
