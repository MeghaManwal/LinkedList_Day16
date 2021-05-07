package com.linkedList;

import com.linkedList.LinkedList.Node;

public class LinkedList {
	
    Node head;
	
    public class Node {
		
	         int data;
	         Node next;
	
	         public Node(int data){
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
    
    public Node poplast() {
   	 
   	         Node res=null;
   	 
	         if(head == null) {
	            System.out.println("head should not be null");
	         }  
	         if(head.next == null) {
	            System.out.println("null");
	         }
	     
	         Node secondlast = head;
	         while(secondlast.next.next != null)
	         secondlast = secondlast.next;
	    
	         res=secondlast.next;
	         secondlast.next = null;	 
	         return res;	 
    }
    
    public LinkedList deletebyKey(LinkedList linkedlist2, int key) {
   	         Node currNode=linkedlist2.head;
   	         Node prev=null;
   	  
   	         if(currNode != null && currNode.data == key) {
   		    linkedlist2.head=currNode.next;
   		    return linkedlist2;
   	         }
   	  
   	         while(currNode != null && currNode.data != key) {
   		    prev = currNode;
   		    currNode = currNode.next;
   	         }	  
   	  
   	         if(currNode != null) {
   		    prev.next =currNode.next;
   	         }
   	  
   	         if(currNode == null) {
   		    System.out.println(key+ "not found");
   	         }
   	  
   	         return linkedlist2;
    }
    
    public void searchByKey(int data) {
   	         boolean flag=false;
 	         int index = 1;
 	         Node temp = head;
 	       
   	         if(head == null) {
   		   System.out.println("List is empty");
   	         }
   	   
   	         else {
   	         while(temp != null) {
   		   if(temp.data == data) {
   			   flag=true;
   			   break;
   		   }
   		   index++;
   		   temp = temp.next;
   	          }
   	         }
	         if(flag)
	           System.out.println("Element present at the position:"+index);
	         else
		   System.out.println("Element not present");
    }
    
    public void searchandInsert(int data, int element) {
    	         boolean flag=false;
	         int index = 1;
	         Node temp = head;
	       
  	         if(head == null) {
  		   System.out.println("List is empty");
  	         }
  	   
  	         else {
  	          while(temp != null) {
  		   if(temp.data == data) {
  			   flag=true;
  			   break;
  		   }
  		   index++;
  		   temp = temp.next;
  	          }
  	         }
	         if(flag) {
	           System.out.println("Element present at the position:"+index);
	           insertAfter(temp, element);
	         }
	         else
		   System.out.println("Element not present");
    }
        
}
