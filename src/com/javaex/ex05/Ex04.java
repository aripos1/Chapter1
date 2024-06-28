package com.javaex.ex05;

public class Ex04 {
	
	public static void main(String[] args) {
	
		int[] numArr = new int[3];
		numArr[0]=3;
		numArr[1]=10;
		numArr[2]=27;
		
		for(int i=0; i <numArr.length; i++) {
			
			numArr[0]=13;
			
			System.out.println(numArr[i]);
		}
}
}
