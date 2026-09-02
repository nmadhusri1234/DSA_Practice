package com.arrays;

public class MissingElement {

	public static void main(String[] args) {
		
	int arr[] = {0,1,5,2,4};
	
	int xor =0;
	int axor=0;
	
	for(int i=1;i<=arr.length;i++)
	{
		xor^=i;
	}
	for(int ele:arr)
	{
		axor^=ele;
	}
	
	System.out.println(xor^axor);  //or finding the total sum and subtracting from array sum
	 
}
}
