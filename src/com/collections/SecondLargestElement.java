package com.collections;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestElement {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(40);
		
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num :l)
		{
			if(num>firstLargest)
			{
				secondLargest=firstLargest;
				firstLargest = num;
				
			}
			else if(num>secondLargest && num!=firstLargest)
			{
				secondLargest=num;
			}
		}
		
		System.out.println("First Largest: "+firstLargest+" "+"Second Largest: "+secondLargest);
		
	}

}
