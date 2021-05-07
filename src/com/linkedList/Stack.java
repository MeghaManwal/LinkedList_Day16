package com.linkedList;

public class Stack {
	
	public static void main (String [] args) {
		LinkedList linkedlist =new LinkedList();
		linkedlist.push(70);
		linkedlist.push(30);
		linkedlist.push(56);
		
		System.out.print("\nStack using LinkedList: \n");
		linkedlist.printStack();
		
	}

}
