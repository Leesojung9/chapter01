package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		
	//스캐너 별명  ↓
		Scanner sc = new Scanner(System.in);  //키보드 준비
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");		
		
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		
		sc.close(); //키보드 닫기
	
		
	//----------------------------------------------------------
	/* 자바의 입력 기능 (Scanner)
	   
	   -자바에서 데이터를 출력하는 명령은 System.out이고,
	   -데이터를 입력 받을 때에는 System.in을 사용한다.
	   -데이터를 입력 받을 때는 표준 JAVA API인 Scanner 클래스를 사용한다.
	   
	   
		1. 스캐너 객체 생성 (단, 하기 scan은 스캐너 이름 작명해서 변수 준 것.)
		Scanner scan = new Scanner(System.in);
		★단 스캐너 객체 생성할 때, 상단에 import java.util.Scanner; 위에 적어 줘야 하는데
		스캐너 객체 생성하면 마우스 클릭해보면 뜸
		
		2. 입력 받을 데이터 타입에 따른 메서드 호출
		-next() :공백을 포함하지 않는 문자열을 입력 받을 때
		-nextline() : 공백을 포함한 문자열을 입력 받을 때
		-nextint(): 정수를 입력 받을 때
		-nextDouble() : 실수를 입력 받을 때
		
		★위 2번까지 입력하고 저장하면 콘솔 네모박스 아이콘 빨간불 들어오는데,
		이는 이클립스가 입력 받을 준비가 돼 있다는 표시.
		
		3. 스캐드 객체 종료
		scan.close();
		*/
		//----------------------------------------------------------
		
	}
	
	
	
	
	
	
}
