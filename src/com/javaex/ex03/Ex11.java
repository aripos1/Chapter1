package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("월을 입력하세요.");
		System.out.print("월 : ");
		int m = sc.nextInt();
		String day;

		switch (m) {
		case 1:
			day = "31일";
			break;
		case 2:
			day = "28일";
			break;
		case 3:
			day = "31일";
			break;
		case 4:
			day = "30일";
			break;
		case 5:
			day = "31일";
			break;
		case 6:
			day = "30일";
			break;
		case 7:
			day = "31일";
			break;
		case 8:
			day = "31일";
			break;
		case 9:
			day = "30일";
			break;
		case 10:
			day = "31일";
			break;
		case 11:
			day = "30일";
			break;
		case 12:
			day = "31일";
			break;
		default:
			day = "1년은 12개월 ";
			break;
		
//		 case 4 : case 6 : case 9 : case 11 : day = "30일"; break;
//		  
//		 case 2: day = "28일"; break;
//		  
//		 default: day = "31일"; break;
		
		}
		
		System.out.println(day + "입니다.");
		sc.close();
	}
}
