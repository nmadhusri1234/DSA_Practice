package com.arrays;

public class MinEle {

	public static void main(String[] args) {
		
		int arr1[] = {12,14,16,19};
		
		int min = Integer.MAX_VALUE;
		
		for(int ele : arr1)
		{
			if(ele<min)
			{
				min = ele;
			}
		}
		
		System.out.println("Minimum element in the array is :"+min);
		
	}

}
