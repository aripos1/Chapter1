package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		
		int point = sc.nextInt();
		String result;
		
		if (point>=90) {
			
			result = "A등급";
			
		}else if(point>=80) {
			
			result = "B등급";
			
		}else if(point>=70) {
			
			result = "C등급";
			
		}else if(point>=60) {
			
			result = "D등급";
			
		}else {
			
			result = "F등급";
			
		}
		
		System.out.println(result);
	
		sc.close();
			
	}
}
