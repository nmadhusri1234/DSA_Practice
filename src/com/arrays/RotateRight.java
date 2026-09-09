package com.arrays;

public class RotateRight {
	
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
	        reverse(arr,0,k-1);
	        reverse(arr,k,n-1);
	        
	    }

	public static void main(String[] args) {
		
//		int arr[]= {10,20,30,40,50};
//		 rotate(arr,2);
//		
//		 for(int num:arr)
//		 {
//			 System.out.print(num+" ");
//		 }
		
		int arr[] = {10, 20, 30, 40, 50};

		int last = arr[arr.length - 1];
		int secondLast = arr[arr.length - 2];

		
		for (int i = arr.length - 1; i >= 2; i--) {
		    arr[i] = arr[i - 2];
		}

		arr[0] = secondLast;
		arr[1] = last;

		for (int num : arr) {
		    System.out.print(num + " ");
		}
	}
	

}