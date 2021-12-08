package com.javaex.ex03;

import java.util.Scanner; //자바 쩜 유틸 안에 있는 스캐너 라는 기능을 쓸 거니까 임포트해 줘

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int num = sc.nextInt();
		 
		if(num>=60) { // 입력한 값이 60점 "이상" 이니?
			//질문이  true 일때만 실행되는 영역
			System.out.println("합격입니다.");
			
		}
		
		
		sc.close();

	}

}