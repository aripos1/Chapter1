package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {

		System.out.print("안녕");
		System.out.println("하세요");

		System.out.println("안녕");
		System.out.println("하세요");

		System.out.println("-----------------");

		int i = 2345;
		double d = 3.14;
		char c = '한';
		String s = "한";
		String str = "굿모닝";
		String name = "임현성";

		System.out.println(str);
		System.out.println(str + " " + name);
		System.out.println(i + i);
		System.out.println(i + d);
		System.out.println(str + i);
		System.out.println(s + i);
		
		String str2 = str + i;
		System.out.println(str2);
		
		System.out.println("제이름은 "+name+" 입니다.");
		
		System.out.println(c + c);
		
		System.out.println("----------------------");
		
		//제이름은 "임현성"입니다.
		System.out.println("제이름은 \""+name+"\" 입니다.");
	
		//제이름은 \임현성\ 입니다.
		System.out.println("제이름은 \\"+name+"\\ 입니다.");
		
		System.out.println("제이름은\t\t"+name+" 입니다.");
		
		System.out.println("제이름은		"+name+" 입니다.");
		
		System.out.println("제이름은\n"+name+" 입니다.");
		
	}

}
