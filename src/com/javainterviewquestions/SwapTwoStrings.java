package com.javainterviewquestions;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2= "world";
		
		System.out.println("****before swapping***");
		System.out.println("value of Str1 is ::"+str1);
		System.out.println("value of Str2 is ::"+str2);
		
		//merge both strings
		
		str1 = str1 + str2; //HelloWorld
		
		//store intial value of Str1 in Str2
		
		str2 = str1.substring(0, str1.length() - str2.length()); // 10-5 -->5
		
		//store intial value of str2 in str1
		
		str1 = str1.substring(str2.length());
		
		System.out.println("****after swapping***");
		System.out.println("value of Str1 is ::"+str1);
		System.out.println("value of Str2 is ::"+str2);

	}

}
