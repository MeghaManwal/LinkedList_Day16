package com.linkedList;

import java.util.List;

public class LinkedListUtil {
	
	public static  void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.push(70);
	    linkedlist.push(30);
		linkedlist.push(56);
		
		linkedlist.printList();
		
	}
}

class LinkedList {
     Node head;
	
	 class Node {
		
		 int data;
		 Node next;
	
		 Node(int data){
		   this.data = data;
		   next =  null;
		 }
		
	 }

     public void push (int data) {
 	     Node newNode=new Node(data);
 	     newNode.next=head;
 	
 	     head=newNode;
 	
     }
 
     public void printList() {
 	     System.out.print("LinkedList:");
 	     Node temp=head;
 	
 	     while(temp != null) {
 		  System.out.print(temp.data+" -> ");
 		  temp = temp.next;
 	     }
     }
}
