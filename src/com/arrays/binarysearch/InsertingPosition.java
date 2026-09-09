package com.arrays.binarysearch;

public class InsertingPosition {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,5};
		int target = 2;
		
		int left = 0;
		int right = arr.length-1;
		int ans = -1;
		
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(target>arr[mid])
			{
				left = mid+1;
			}
			else
			{
				right = mid-1;
			}
		}
		System.out.println("Position is :"+left);

	}

}
