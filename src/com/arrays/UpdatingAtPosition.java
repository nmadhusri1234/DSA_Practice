package com.arrays;

public class UpdatingAtPosition {
	
	public static void main(String[] args) {

	int arr1[] = {12,14,16,19};
	
	int arr2[] = new int[arr1.length];
	
	int pos = 2;
	int val = 13;
	
	for(int i=0;i<pos;i++)
	{
		arr2[i]=arr1[i];
	}
	arr2[pos] =val;
	for(int i=pos+1;i<arr1.length;i++)
	{
		arr2[i]=arr1[i];
	}
	
	for(int i=0;i<arr2.length;i++)
	{
		System.out.print(arr2[i]+" ");
	}
	
	}
}
