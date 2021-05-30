package com.javainterviewquestions;

public class PrimeNumber {

	public static void main(String[] args) {
//		System.out.println(" 2 is prime numner ::"+isPrimeNumber(2));
//		System.out.println("3 is prime number ::"+isPrimeNumber(3));
//		System.out.println("0 is prime number::"+isPrimeNumber(0));
//		
		getPrimeNumbers(16);

	}

	//method to find prime numner
	public static boolean isPrimeNumber(int num){
		if(num<=1)
			return false;
		for(int i=2; i<num ; i++){
			if(num%i ==0){
				return false;
			}
		}
		return true;
		
	}
	
	//method to print all prime number from given range
	
	public static void getPrimeNumbers(int num){
		for(int  i=2; i<=num ;i++){
			if(isPrimeNumber(i))
				System.out.println(i + " ");
		}
		
	}
}
