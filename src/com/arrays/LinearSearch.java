package com.arrays;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[] = {40,30,10,50,80};
		
		int key = 50;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Element found at index"+i+" :"+arr[i]);
				break;
			}
		}

	}

}
