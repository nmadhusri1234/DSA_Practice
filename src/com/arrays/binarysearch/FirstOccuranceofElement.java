package com.arrays.binarysearch;

public class FirstOccuranceofElement {

	public static void main(String[] args) {
		
//		int arr[] = {3,5,2,2,5,9,9,7,3,7};
//		int target = 9;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==target)
//			{
//				System.out.println("Element found at : "+i);
//				return;
//			}
//		}
		
		int arr[] = {1,2,2,2,2,2,2,3,3,3,4};
		int target = 2;
		
		int left = 0;
		int right = arr.length-1;
		int ans = -1; //no indx found
		
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(arr[mid]==target)
			{
				ans = mid;
				right = mid-1; //go left to find first occurance
				
			} else if(target<arr[mid])
			{
				right = mid-1;
			}else
			{
				left=mid+1;
			}
				
		}
		System.out.println("First occurancce :"+ans);
		

	}

}
