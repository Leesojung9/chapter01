package com.javaex.ex02;

import java.util.Scanner; //임포트 단축키 ctrl + sift + o

public class Ex02 {
	public static void main(String[] args) {
		
	//------------스캐너---------------------		
	Scanner sc = new Scanner(System.in); //해당 코드 외울 것
	
	System.out.println("숫자를 입력하세요");
	int num = sc.nextInt();
	System.out.println("입력하신 숫자는" + num + "입니다.");


	sc.close();
	//------------스캐너---------------------		
		
		
		
	}
}
