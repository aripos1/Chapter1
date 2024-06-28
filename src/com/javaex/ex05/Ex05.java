package com.javaex.ex05;

public class Ex05 {
	
	public static void main(String[] args) {
		
		int[] numArr = new int[6];
		
		for (int i=0; i<numArr.length; i++) {
			
			//int ran = (int)(Math.random()*45)+1;
			
			numArr[i]=(int)(Math.random()*45)+1;;
			
			System.out.print(numArr[i]+"\t");
		}
	}

}
