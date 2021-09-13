package com.home.algorithm;

import java.util.NoSuchElementException;

class Queue<T> {
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		
		if (tail != null) {
			tail.next = t;
		}
		tail = t;
		if (head == null) {
			head = tail;
		}
	}
	
	public T remove() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		
		T data = head.data;
		head = head.next;
		
		if (head == null) {
			tail = null;
		}
		
		return data;
	}
	
	public T peek() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		
		T data = head.data;
		return data;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
}

public class QueueTest {
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.remove());
		System.out.println(q.peek());
		q.remove();
		q.remove();
		System.out.println(q.isEmpty());
	}
}
