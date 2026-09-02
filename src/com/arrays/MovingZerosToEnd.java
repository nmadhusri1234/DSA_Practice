package com.arrays;

public class MovingZerosToEnd {

	public static void main(String[] args) {
		
		int arr[] = {2,0,0,4,6,0,1};

		int index = 0; //updating non zero elements
		
		for(int i=0;i<arr.length;i++) //initially placing all the non zero elements at starting
		{
			if(arr[i]!=0)
			{
				arr[index]=arr[i];
				index++;
			}
			
		}
		while(index<arr.length) //making ending 0's
		{
			arr[index]=0;
			index++;
		}
		
		for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
  		    }
		
	}

}
