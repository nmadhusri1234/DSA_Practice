package com.strings;

public class NoOfWords {

	public static void main(String[] args) {
		
		String str = "I Love Java Programming";
		 
		String strr[] = str.trim().split("\\s+");
		
		System.out.println(strr.length);
		

	}

}
