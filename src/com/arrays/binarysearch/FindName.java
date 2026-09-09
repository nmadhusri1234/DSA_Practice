package com.arrays.binarysearch;

public class FindName {

	public static void main(String[] args) {
		
		String names[] = {"madhu","divya","dongala","nissankararao"};
		String target = "dongala";
		
		int left = 0;
		int right = names.length-1;
		
		while(left<=right)
		{
			int mid = (left+right)/2;
			
			//It compares two strings lexicographically (dictionary order).
			int cmp = names[mid].compareTo(target); 
			
			if(cmp==0)
			{
				System.out.println("found at: "+mid);
				return;
			}else if(cmp>0)
			{
				right = mid-1;
			}
			else
			{
				left = mid+1;
			}
			
		}

	}

}
