package com.home.algorithm;

class BNode {
	int data;
	BNode left;
	BNode right;
}

class Tree {
	private BNode root;
	
	public void setRoot(BNode BNode) {
		this.root = BNode;
	}
	
	public BNode getRoot() {
		return root;
	}
	public BNode makeBNode(BNode left, int data, BNode right) {
		BNode BNode = new BNode();
		BNode.data = data;
		BNode.left = left;
		BNode.right = right;
		return BNode;
	}
	public void inOrder(BNode BNode) {
		if (BNode != null) {
			inOrder(BNode.left);
			System.out.println(BNode.data);
			inOrder(BNode.right);
		}
	}
	public void preOrder(BNode BNode) {
		if (BNode != null) {
			System.out.println(BNode.data);
			inOrder(BNode.left);
			inOrder(BNode.right);
		}
	}
	public void postOrder(BNode BNode) {
		if (BNode != null) {
			inOrder(BNode.left);
			inOrder(BNode.right);
			System.out.println(BNode.data);
		}
	}
}

public class BinaryTree {
	public static void main(String[] args) {
		Tree t = new Tree();
		BNode n4 = t.makeBNode(null, 4, null);
		BNode n5 = t.makeBNode(null, 5, null);
		BNode n2 = t.makeBNode(n4, 2, n5);
		BNode n3 = t.makeBNode(null, 3, null);
		BNode n1 = t.makeBNode(n2, 1, n3);
		t.setRoot(n1);
		t.inOrder(t.getRoot());
	}
}