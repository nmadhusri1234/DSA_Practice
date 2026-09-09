package com.arrays;

public class FirstEvenNumber {

	public static void main(String[] args) {
		
		int arr[] = {409,307,10,508,801};
		
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]&1)==0)
			{
				System.out.println("Even Number Found : "+arr[i]);
				break;
				
			}
		}

	}

}
