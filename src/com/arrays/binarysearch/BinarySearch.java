package com.arrays.binarysearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {409,307,10,508,801};
		int key = 508;
		Arrays.sort(arr);
		
		
		int low =0;
		int high = arr.length-1;
				
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("Element found : "+key);
				break;
			}
			if(key<arr[mid])
			{
				high = mid-1;
			}
			if(key>arr[mid])
			{
				low = mid+1;
			}
		}
		
	}

}
