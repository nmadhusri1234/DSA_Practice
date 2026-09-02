package com.arrays;

public class MajorityElement {

	public static void main(String[] args) {
		
		int arr[] = {12,14,12,16,19,12,12};
		
		int majority = -1;
		int countt=0;
		for(int i=0;i<arr.length;i++)
		{
		    countt=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					countt++;
				}
			}
		if(countt>arr.length/2)
		{
			majority = arr[i];
			break;
			
		}
		}
		System.out.println("Majority element: "+majority);
		
		
		int ele = arr[0];
		int count = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==ele)
			{
				count++;
			}
			else
			{
				count--;
			}
			
			if(count<0)
			{
			 ele = arr[i];
			}
			
		}
		
		System.out.println("Majority element: "+ele);
		
		
	}

}
