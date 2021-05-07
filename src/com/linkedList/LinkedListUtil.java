package com.linkedList;

import java.util.List;

import com.linkedList.LinkedList.Node;

public class LinkedListUtil {
	
	public static  void main(String[] args) {
		
		Node haed;
		//To delete first element in the LinkedList
		LinkedList linkedlist = new LinkedList();
		linkedlist.push(70);
	        linkedlist.push(30);
		linkedlist.push(56);
		
		linkedlist.printList();
		System.out.println("\n Head Element before pop: "+ linkedlist.topValue());
		
		linkedlist.pop();
		linkedlist.printList();
		System.out.println("\n Head Element after pop: "+ linkedlist.topValue());
		
		//To delete last element in the LinkedList
		LinkedList linkedlist1 = new LinkedList();
		linkedlist1.append(70);
	        linkedlist1.append(30);
		linkedlist1.append(56);
		
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
		System.out.println("\n \nInsert 30 between 56 and 70");
		linkedlist2.printList();
		
		//To Delete Element by Key
		LinkedList linkedList = new LinkedList();
		linkedList.deletebyKey(linkedlist2, 56);
		System.out.println("\n \nLinkedList after deleting element");
		linkedlist2.printList();
		
		//To search for Element by key
		System.out.println("\n \nTo search the Element");
		LinkedList linkedlist3 = new LinkedList();
		linkedlist3.append(70);
	        linkedlist3.append(30);
		linkedlist3.append(56);
		linkedlist3.append(40);
		linkedlist3.searchByKey(30);
			
		
	}
}


     
     

