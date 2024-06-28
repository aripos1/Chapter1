package com.javaex.ex04;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		int sum = 0;
		
		while(true) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			
			if (num==0) {
				break;
			}else{
					sum = sum +num;
					System.out.println("합계 : "+sum);
			}
		}
		System.out.println("종료");
		sc.close();
	}

}
