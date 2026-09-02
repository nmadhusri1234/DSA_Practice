package com.arrays;

//inserting a value at specific position
public class InsertAtPosition {

	public static void main(String[] args) {
		
		int arr1[] = {12,14,16,19};
		
		int arr2[] = new int[arr1.length+1];
		
		int pos = 2;
		int val = 13;
		
		//inserting values upto position
		for(int i=0;i<pos;i++)
		{
			arr2[i]=arr1[i];
		}
		
		arr2[pos] = val;
		
		for(int i=pos;i<arr1.length;i++)
		{
			arr2[i+1]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		

	}

}
