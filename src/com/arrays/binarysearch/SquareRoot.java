package com.arrays.binarysearch;

public class SquareRoot {

	public static void main(String[] args) {
		
		int n = 20;
		
		//System.out.println(Math.sqrt(n));
		
//		for(int i=1;i<n/2;i++)
//		{
//			if(i*i==n)
//			{
//				System.out.println(i);
//				break;
//			}
//		}
//		
		int low = 1;
		int high = n;
		int ans = 1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(mid * mid <= n)
			{
				ans = mid;
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		//System.out.println(high);
		System.out.println(ans);

	}

}
