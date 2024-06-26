package com.javaex.ex04;

public class Ex09 {
	
	public static void main(String[] args) {
		
		int i = 1;
		while (true) {
			int x = i%6;
			int y = i%14;
			if(x==0&&y==0) {
				System.out.println(i);
				break;
			}
			
			i++;
			
		}
	}
}
