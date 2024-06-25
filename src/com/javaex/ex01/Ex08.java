package com.javaex.ex01;

public class Ex08 {
	
	public static void main(String[] args) {
		
		int var01 = 2;
		double var02 = 3.5;
		
		System.out.println(var01+var02);
				
		double result01 = var01 + var02;
		System.out.println(result01);
		
		//강제형변환
		
		double var03 = 13.212;
		int var04 =(int)var03; //()안에 변경할 변수를 입력
		
		System.out.println(var04);
		
		
		int var05 = 2;
		double var06 = (double)var05;
		
		System.out.println(var06);
		
	}

}
