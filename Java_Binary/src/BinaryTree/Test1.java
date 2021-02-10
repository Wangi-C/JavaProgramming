package BinaryTree;

public class Test1 {
	public static void main(String[] args) {
		Tree t = new Tree();
		Node n4 = t.makeNode(4, null, null);
		Node n5 = t.makeNode(5, null, null);
		Node n2 = t.makeNode(2, n4, n5);
		Node n3 = t.makeNode(3, null, null);
		Node n1 = t.makeNode(1, n2, n3);
		t.setRoot(n1);
		t.inorder(t.getRoot());
		System.out.println("-----------");
		t.preorder(t.getRoot());
		System.out.println("-----------");
		t.postorder(t.getRoot());
	}
}
