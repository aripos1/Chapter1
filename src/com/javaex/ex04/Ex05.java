package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		
		
		//for문
		System.out.println("for문 입니다.");
		int fi=0;
		int fsum = 0;
		for(fi=1; fi<11; fi++) {
		
			fsum = fsum+fi;
			//fsum += fi;
			System.out.println(fi+"까지의 합은 "+fsum+" 입니다.");
			
		}
		
		System.out.println("1부터 "+(fi-1)+"까지의 합은 "+fsum+" 입니다.");
		System.out.println("==========================");
		
		
		//while문
		System.out.println("while문 입니다.");
		int i = 0;
		int sum = 0;
		while(i<11) {
			
			sum += i;
			i++;
		
			System.out.println((i-1)+"까지의 합은 "+sum+" 입니다.");
		}
	
		
		System.out.println("1부터 "+(i-1)+"까지의 합은 "+sum+" 입니다.");
	}
}
