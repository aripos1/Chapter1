package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		//10번을 반복하는 if에 조건에 맞게 되면 종료
		for(int i=1; i<11; i++) {
			if (i%2==0&&i%3==0) {
				break;
			}
			
			System.out.println(i);
		}
		System.out.println("---------------------");
		for(int i=1; i<11; i++) {
			if (i%2==0&&i%3==0) {
				continue;
			}
			
			System.out.println(i);
		}
		System.out.println("---------------------");
		for(int i=1; i<11; i++) {
			if (i%2==0&&i%3==0) {
			//조건에 만족하면 출력하지 않음	
			}else {
				System.out.println(i);
			}
			
			
		}System.out.println("---------------------");
		for(int i=1; i<11; i++) {
			if (!(i%2==0&&i%3==0)) {
			System.out.println(i);
			}
			
			
		}
	}
}
