package com.arrays;

public class DeleteAtPosition {

	public static void main(String[] args) {
		
		int arr1[] = {12,14,16,19};
		
		int arr2[] = new int[arr1.length-1];
		
		System.out.println("Initial Array ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("\n");
		int pos = 2;
		
		for(int i=0;i<pos;i++)
		{
			arr2[i]=arr1[i];
		}
		
		for(int i=pos+1;i<arr1.length;i++)
		{
			arr2[i-1]=arr1[i];
		}
		
		System.out.println("After deletion ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		
	}

}
