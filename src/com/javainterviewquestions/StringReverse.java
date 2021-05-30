package com.javainterviewquestions;

public class StringReverse {

	public static void main(String[] args) {
		
		
		//1.Approach 1
	String s = "Selenium";
//		int len = s.length(); //8
//		
//		String reverse = "";
//		
//		for(int j=len-1 ; j>=0 ; j--){
//			reverse = reverse + s.charAt(j);
//		}
//		System.out.println(reverse);
		
		
		//Approach 1 using for loop
	/*	String str = "Selenium";
		
		int len = str.length();
		
		String rev = " ";
		
		for (int i=len-1 ; i>=0 ; i--){
			
			rev= rev + str.charAt(i);
		}
		
		System.out.println("reverse is : "+rev); */
		
		
		
		//2.Approach 2
		
		StringBuffer bf  = new StringBuffer(s);
		System.out.println("reverse of string passed by user is:"+bf.reverse());

	}
	
	
	
	
}
