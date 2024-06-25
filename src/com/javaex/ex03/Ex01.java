package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		System.out.print("점수: ");
		int point = sc.nextInt();
		sc.nextLine();
			
		if(point>=60&&point<101) {
			
			System.out.println("합격입니다." );
			
		}else if(point>=101||point<0){
			
			System.out.println("다시 입력하세요." );
			
		}else if(point>=40){
				
			System.out.println("노력하세요." );
			
		}else {
			
			System.out.println("불합격입니다." );
			
		}
		
		
		
		sc.close();
		
	}

}
