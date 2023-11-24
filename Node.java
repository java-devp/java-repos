package com.test.intv;

public class Node {
	
	
	int data;
	Node next;
	
	Node(int data ){
		this.data = data;
	} 
	
	public static void main(String[] args) {
		
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		
		Node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
		
		getNode(head);
		
		System.out.println(n1.data);
		System.out.println(n1.next.data);
		System.out.println(n1.next.data);
		System.out.println(n1.next.data);
		
		
	}
	
	static void getNode(Node head) {
		Node CurrentNode = head;
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		
		
		
	}

}
