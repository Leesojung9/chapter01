package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
	
			Scanner sc = new Scanner(System.in);
			
			System.out.println("나이를 입력해 주세요.");
			
			System.out.print("나이:");			
			int age = sc.nextInt();
			
			sc.nextLine(); //엔터를 소비한다.
			//위와 같이 엔터를 소비하는 이유는,
			//스캐너 기능 사용할 때 정수열 입력 받은 후 문자열 입력 받게 되면 버그가 일어나서
			//이름을 입력하지 못한채로 결과값이 출력 되기 때문에
			//위 엔터 소비로(받는척만, 실제로는 담아서 출력하는 기능 아님) 버그 해결
			
			System.out.println("이름을 입력해 주세요.");
			
			System.out.print("이름:");
			String name = sc.nextLine();
			

			
			
			System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
			
			
			sc.close();
		
		
		
		
		
		
		
		
	}
	
	
	
}
