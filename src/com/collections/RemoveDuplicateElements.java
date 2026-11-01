package com.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {

	ArrayList<Integer> al = new ArrayList<>();
	
	al.add(10);
	al.add(50);
	al.add(30);
	al.add(20);
	al.add(10);
	al.add(30);
	al.add(40);
	
	
	
	LinkedHashSet<Integer> unique = new LinkedHashSet<>(al);
	
	System.out.println(unique);
	
	
	
	}
	
}
