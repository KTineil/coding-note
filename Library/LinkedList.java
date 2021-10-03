package com.home.algorithm;

class LinkedList {
	class LNode {
		int data;
		LNode next;
	}

	class Reference {
		int count = 0;
	}
	
	LNode header;
	
	public LinkedList() {
		header = new LNode();
	}
	public LNode getFirst() {
		return header.next;
	}
	public void append(int data) {
		LNode newLNode = new LNode();
		newLNode.data = data;
		LNode n = header;
		while (n.next != null) {
			n = n.next;
		}
		n.next = newLNode;
	}
	
	public void delete(int data) {
		LNode n = header;
		while (n.next != null) {
			if (n.next.data == data) {
				n.next = n.next.next;
			} else
				n = n.next;
		}
	}
	public void retrieve() {
		LNode n = header.next;
		while (n.next != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println(n.data);
	}
	
	Reference R = new Reference();
	public int KthToLast(LNode n, int k) {
		LNode found = KthToLast(n, k, R);
		return found.data;
	}
	public LNode KthToLast(LNode n, int k, Reference r) {
		if (n == null) 
			return null;
		
		LNode found = KthToLast(n.next, k, r);
		r.count++;
		
		if (r.count == k)
			return n;
		else 
			return found;
	}
}
