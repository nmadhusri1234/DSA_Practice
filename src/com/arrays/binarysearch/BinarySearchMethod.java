package com.arrays.binarysearch;

import java.util.Arrays;

public class BinarySearchMethod {

	public static void main(String[] args) {
		
		int arr[] = {10,60,20,40,30,90};
		
		Arrays.sort(arr);
		
		//searching in a sorted array
		System.out.println(Arrays.binarySearch(arr, 40));
		
		int key =40;
		
		//searching within a range
		System.out.println(key+" found at :"+Arrays.binarySearch(arr,2,5,key));
		

	}

}
