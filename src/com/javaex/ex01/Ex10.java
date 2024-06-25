package com.javaex.ex01;

public class Ex10 {
	
	public static void main(String[] args) {
		
		//대입연산자 =
		int a = 7;
		int b = 2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("-------------------------");
		
		//산술연산자 +,-,*,/,%
		
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//자세히
		
		System.out.println(7/2);
		System.out.println(7.0/2);
		System.out.println("-------------------------");
		
		int var = -3;
		int pVar = +var; //+(-3) = -3
		int mVar = -var; //-(-3) = 3
		
		System.out.println(pVar);
		System.out.println(mVar);
		
		System.out.println("-------------------------");
		
		//증감연산자
		System.out.println(a);
		System.out.println(++a); //*a-> 원래값을 바꾼다
		System.out.println(a);
		
		
		System.out.println(b); //2
		System.out.println(--b); //1
		System.out.println(b);
		
	}

}
