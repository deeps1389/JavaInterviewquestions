package com.javainterviewquestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestAndSmallest {

	public static void main(String[] args) {
		//Program to find largest & Smallest number in given array
		
		int numbers[] = {-10, 20, -88, 0, 98756};
		
		int largest= numbers[0];
		int smallest = numbers[0];
		
		for(int i=1; i<numbers.length;i++){
			if(numbers[i]>largest){
				largest = numbers[i];
			}
			else if (numbers[i]< smallest ){
				smallest= numbers[i];
			}
		}
		System.out.println("\n Given Array is ::" +Arrays.toString(numbers));
		System.out.println("largest number is ::"+largest);
		System.out.println("smallest number is ::"+smallest);

	}

}
