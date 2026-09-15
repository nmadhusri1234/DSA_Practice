package com.arrays;

public class FrequencyOfEachElement {

	public static void main(String[] args) {
		
		System.out.println("Program started");
		int arr[] = {1,2,2,3,1,1};
		int n = arr.length;
		
		int res[] = new int[arr.length];
		boolean vis[]=new boolean[n];
		
		for(int i=0;i<n;i++)
		{
			if(vis[i]==true)
				continue;
			for(int j =i;j<n;j++)
			{
				
				if(arr[i]==arr[j])
				{
					res[i]++;
					vis[j]=true;
				}
			}
			
		}
		for(int i=0;i<n;i++)
		{
			if(res[i]!=0)
			{
			System.out.println(i+1+"->"+res[i]);
			}
		}

	}

}
