package com.recursion;

public class SumofRecursiveDigits {
	
	public static int sum(int n)
	{
		if(n<10)
			return n;
		int s=0;
		while(n>0)
		{
			s=s+n%10;
			n=n/10;
		}
		
		return sum(s);
	}

	public static void main(String[] args) {
		
		int n = 4321;
		System.out.println(sum(n));

	}

}
