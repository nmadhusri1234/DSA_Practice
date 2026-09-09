package com.arrays;

public class RotateLeft {
	
	public static void reverse(int[] arr,int a,int b)
    {
        while(a<=b)
        {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        a++;
        b--;
        }
    }
	
	  public static void rotate(int[] arr, int k) {
	        int n=arr.length;
	        k=k%n;
	        reverse(arr,0,n-1);
	        reverse(arr,0,k);
	        reverse(arr,k+1,n-1);
	        
	    }

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		 rotate(arr,2);
		
		 for(int num:arr)
		 {
			 System.out.print(num+" ");
		 }
		 
	}

}