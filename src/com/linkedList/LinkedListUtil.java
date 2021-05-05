package com.linkedList;


import java.util.LinkedList;

public class LinkedListUtil {
	
	public static  void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(30);
	        list.add(56);
		list.add(70);
		
		list.forEach(System.out::println);
		
	}
}
