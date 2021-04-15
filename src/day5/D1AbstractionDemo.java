package day5;

import java.util.Arrays;

public class D1AbstractionDemo {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		// abstraction
		System.out.println("String length " + str.length());
	
		
		// arrray of number
		int number[] = new int[] {32, 43, 54, 12, 78, 23, 1};
		
		System.out.println("Before Sorting!!");
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		

		// Abstraction
		Arrays.sort(number);
		
		System.out.println("After Sortin!!!");
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
	}

}
