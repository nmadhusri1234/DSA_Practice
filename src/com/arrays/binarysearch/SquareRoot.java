package com.arrays.binarysearch;

public class SquareRoot {

	public static void main(String[] args) {
		
		int n = 4;
		
		int low = 0;
		int high = n;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(mid * mid ==n)
			{
				System.out.println(mid);
				return;
			}
		}

	}

}
