package com.arrays;

public class MaxEle {

	public static void main(String[] args) {
		
		int arr1[] = {12,14,16,19};
		
		int max = Integer.MIN_VALUE;
		
		for(int ele : arr1)
		{
			if(ele>max)
			{
				max = ele;
			}
		}
		
		System.out.println("Maximum element in the array is :"+max);
		
	}

}
