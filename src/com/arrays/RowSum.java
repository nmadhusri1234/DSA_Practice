package com.arrays;

public class RowSum {

	public static void main(String[] args) {
		
		int arr[] [] = {{1,2,3},
				        {4,5,6},
				        {7,8,9}};
		

		for(int i=0;i<arr.length;i++)
		{
			int rsum = 0;
			for(int j=0;j<arr[i].length;j++)
			{
				rsum+=arr[i][j];

			}
			System.out.print(rsum+" ");
			System.out.println();
		}
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");

			}
			System.out.println();
		}
	}

}
