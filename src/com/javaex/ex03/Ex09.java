package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("1.자바 2.C 3.C++ 4.파이썬");
		System.out.print("과목번호 :");
		
		int num = sc.nextInt();
		String room;
		
		if (num==1) {
			room = "R101호";
		}else if (num==2) {
			room = "R202호";
		}else if (num==3) {
			room = "R303호";
		}else if (num==4) {
			room = "R404호";
		}else {
			room = "상담원에게 문의하세요.";
		}
		
	
		System.out.println(room);
		sc.close();
	
		
	}

}
