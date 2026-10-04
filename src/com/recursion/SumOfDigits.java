package com.recursion;

public class SumOfDigits {
	
	public static int sum(int n)
	{
		if(n<=0)
			return 0;
		
		int sum = n%10+sum(n/10);
		
		return sum;
	}

	public static void main(String[] args) {
		
		int n = 4321;
		System.out.println(sum(n));

	}

}
