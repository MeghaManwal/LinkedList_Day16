package com.linkedList;

import java.util.List;

public class LinkedListUtil {
	
	public static  void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.push(70);
	        linkedlist.push(30);
		linkedlist.push(56);
		
		//To delete first element in the LinkedList
		linkedlist.printList();
		System.out.println("\n Head Element before pop: "+ linkedlist.topValue());
		
		linkedlist.pop();
		linkedlist.printList();
		System.out.println("\n Head Element after pop: "+ linkedlist.topValue());
		
		LinkedList linkedlist1 = new LinkedList();
		linkedlist1.append(70);
	        linkedlist1.append(30);
		linkedlist1.append(56);
		
		//To delete last element in the LinkedList
		System.out.println("\nLinkedList before poplast:");
		linkedlist1.printList();
		
		linkedlist1.poplast();
		System.out.println("\nLinkedList after poplast:");
		linkedlist1.printList();
	
		//To insert 30  between 56 and 70
		LinkedList linkedlist2 = new LinkedList();
		linkedlist2.append(56);
		linkedlist2.append(70);
		
		linkedlist2.insertAfter(linkedlist2.head, 30);
		System.out.println("\n");
		linkedlist2.printList();	
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
     
     public void insertAfter(Node prevNode, int data) {
    	     if(prevNode==null) {
    		 System.out.println("Previous node should not be null");
    	     }
    	 
    	     Node newNode = new Node(data);
    	     newNode.next = prevNode.next;
    	     prevNode.next = newNode;
     }
     
     public boolean isEmpty() {
    	     return head == null;
     } 
     
     public int topValue() {
    	     if(!isEmpty()) 
    		   return head.data; 
    	     else
    		   return 0;
     }
     
     public void pop() {
    	     if (head == null) {
    		  System.out.println("head should not be null");
    	     }
             head=(head).next;	 	 
     }
     
     public void poplast() {
	     if (head == null) {
	       System.out.println("head should not be null");
	     }  
	     if(head.next == null) {
	        System.out.println("null");
	     }
	     
	     Node secondlast = head;
	     secondlast = secondlast.next;
	    
	     secondlast.next = null;	 
	    	 
 }
     
     
     
}
