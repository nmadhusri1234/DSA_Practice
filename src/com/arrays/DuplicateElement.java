package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

		for (int num : arr) {
		    m.put(num, m.getOrDefault(num, 0) + 1);
		}

		boolean found = false;

		for (Map.Entry<Integer, Integer> mp : m.entrySet()) {

		    if (mp.getValue() > 1) {
		        System.out.println("Duplicate element: " + mp.getKey());
		        found = true;
		    }
		}

		if (!found) {
		    System.out.println("Duplicate not there");
		}
		
	}
}
		