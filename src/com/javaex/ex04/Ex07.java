package com.javaex.ex04;

public class Ex07 {
	
	public static void main(String[] args) {
		
//		for (int i = 0; i<6; i++ ) {
//			System.out.println("******");
//		}
//		for (int i = 0; i<6; i++ ) {
//			switch (i) {
//			
//			case 0 :
//				System.out.println("*");
//				break;
//			case 1 :
//				System.out.println("**");
//				break;
//			case 2 :
//				System.out.println("***");
//				break;
//			case 3 :
//				System.out.println("****");
//				break;
//			case 4 :
//				System.out.println("*****");
//				break;
//			case 5 :
//				System.out.println("******");
//				break;
//			}
//			
//		}
		for (int i = 0; i<6; i++ ) {
			
			for(int s = 0; s<6; s++) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		for (int i = 1; i<7; i++ ) {
			
			for (int s = 1; s<=i; s++) {
			System.out.print("*");
							
			}
			
			System.out.println();
		}
	}
}
				
