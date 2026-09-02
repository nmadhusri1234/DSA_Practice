package com.arrays;

public class AverageOfArray {

	public static void main(String[] args) {
		
		int arr[] = {2,4,6,1};
		int sum =0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println("Average : "+sum/arr.length);

	}

}
