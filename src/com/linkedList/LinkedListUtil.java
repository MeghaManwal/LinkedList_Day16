package com.linkedList;

import java.util.List;

public class LinkedListUtil {
	
	public static  void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.push(70);
	        linkedlist.push(30);
		linkedlist.push(56);
		
		linkedlist.printList();
		System.out.println("\n");
		
		LinkedList linkedlist1 = new LinkedList();
		linkedlist1.append(70);
	        linkedlist1.append(30);
		linkedlist1.append(56);
		
		linkedlist1.printList();
		
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
     
     public void append(int data) {
    	     Node newNode = new Node(data);
    	     if(head == null) {
    		 head= newNode;
    		 return;
    	     }
    	 
    	     Node last= head;
    	     while(last.next != null) {
    		 last = last.next;
    	     }
    	     last.next=newNode;
     }
     
}
