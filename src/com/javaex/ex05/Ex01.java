package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {

//		System.out.println((int)(Math.random()*45)+1);
//		System.out.println((int)(Math.random()*45)+1);
//		System.out.println((int)(Math.random()*45)+1);
//		System.out.println((int)(Math.random()*45)+1);
//		System.out.println((int)(Math.random()*45)+1);
//		System.out.println((int)(Math.random()*45)+1);

//		for (int i=1; i<7; i++) {
//		int no = (int)(Math.random()*45)+1;
//		System.out.print(no+" ");
//		}

//		int[] numArr = new int[6];
//		int no = (int) (Math.random() * 45) + 1;
//		
//		numArr[0]= no;
//		numArr[1]= no;
//		numArr[2]= no;
//		numArr[3]= no;
//		numArr[4]= no;
//		numArr[5]= no;

//		numArr[0]= (int) (Math.random() * 45) + 1;
//		numArr[1]= (int) (Math.random() * 45) + 1;
//		numArr[2]= (int) (Math.random() * 45) + 1;
//		numArr[3]= (int) (Math.random() * 45) + 1;
//		numArr[4]= (int) (Math.random() * 45) + 1;
//		numArr[5]= (int) (Math.random() * 45) + 1;
		
		
		int[] numArr = new int[6];
		for (int i = 0; i < numArr.length; i++) {
			int ran = (int) (Math.random() * 45) + 1;
			numArr[i] = ran;
			System.out.println(numArr[i]);
		}

		System.out.println("--------------------");
		
		for (int i = 0; i < 7; i++) {
			int ran = (int) (Math.random() * 45) + 1;
			int[] num1Arr = new int[] { ran, ran, ran, ran, ran, ran, ran };
			System.out.println(num1Arr[i]);
		}

	}

}
