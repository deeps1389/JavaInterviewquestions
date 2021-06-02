package com.javainterviewquestions;

public class SwapTwoIntegers {

	public static void main(String[] args) {
		int x = 10;
		int y= 5;
		
		//1.using third variable
		
//		int temp;
//		 temp =x;
//		 x=y;
//		 y=temp;
//		 
//		 System.out.println("Values of x:"+x+"and y is:"+y);
//		 
		 //2.using airthmatic operator +
//		 
//		 x=x+y; //15
//		 y=x-y; //15-5 =10
//		 x=x-y;//5
//		 System.out.println("Values of x:"+x+"and y is:"+y);	 

		 
		 //airthmatic operator /
//		 x=x*y; //50
//		 y=x/y;//50/5 = 10
//		 x=x/y;//50/10 =5
//		 System.out.println("Values of x:"+x+"and y is:"+y);
//		 
		 //using XOR operator
		
		 
		 x= x^y; //15 0101 -->1111
		 y=x^y; //1111 1010 -->0101
		 x=x^y;//111
		 System.out.println("Values of x:"+x+"and y is:"+y);
		 
		 System.out.println("File modified for GIT operations");
	}
	
	

}
