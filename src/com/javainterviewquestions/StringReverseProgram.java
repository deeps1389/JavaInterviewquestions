package com.javainterviewquestions;

public class StringReverseProgram {

	public static void main(String[] args) {
		//Approach 1: using for loop
		
		String str = "Selenium";
		
		int len = str.length();
		
		String rev = " ";
		
		for(int j=len-1;j>=0;j--){
			rev = rev + str.charAt(j);
		}
		System.out.println("rev:"+rev);
		
		
		
		
		//Approach 2 -using string buffer
		StringBuffer bf = new StringBuffer(str);
		System.out.println("reverse of string passed by user is :: "+bf.reverse());
		

	}

}
