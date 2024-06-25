package com.javaex.ex03;

public class Ex16 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		for(i=1; i<11; i++) {
			sum += i;
			System.out.println(i+"까지의 합은 "+sum+" 입니다.");
		}
		
		System.out.println("1부터 "+(i-1)+"까지의 합은 "+sum+" 입니다.");
	}
}
