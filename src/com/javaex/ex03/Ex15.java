package com.javaex.ex03;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		System.out.println("단을 입력해주세요.");
		System.out.print("단 : ");
		
		int dan =sc.nextInt();
		
		for(i=1; i<10; i++) {
			System.out.println(dan +"*"+i+"="+dan*i);
			sc.close(); // 왜 여기서 되는거지?
		}
		
		
				
	
	}
}			
