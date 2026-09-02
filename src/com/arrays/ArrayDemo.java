package com.arrays;
import java.util.*;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr3[];
		System.out.println("Array is declared");
		
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("enter "+ n +" elements");
		for(int i =0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n");
		int arr1[] = {2,4,6,7};
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}

		System.out.println("\n");
		
		arr1[2]=5;
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(i+" "+arr1[i]);
		}
		
		sc.close();
	}

}
