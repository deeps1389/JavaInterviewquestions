package com.javainterviewquestions;

public class RemoveJunkChar {

	public static void main(String[] args) {
		
		//1.Using regular expression
		
		
		String str = ("asdacc@#$$%&123456^_+~vbbgff");
		
		String result = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(result);
		
		
		
	}

}
