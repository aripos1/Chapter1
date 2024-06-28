package com.javaex.ex04;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = 15;
		
		if(num==15) {
			System.out.println("같다");
		}
		System.out.println("----------------");
		
		char ch ='c';
		if(ch=='c') {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		System.out.println("----------------");
		
		String str = sc.nextLine();
		if(str.equals("a")) {
			System.out.println("같다");
		}
		
		
	}
}
