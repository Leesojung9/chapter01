package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
	// for반복문 vs while반복문
	// 반복의 횟수를 알 수 없을때 while 반복문
	// 반복의 횟수를 알 수있을때 for 반복문
	// 6의 배수이자 14의 배수인 가장 적은 정수 찾기 (42)
	// --------------------------------------------------------------


		int i=0;   // 비교할 정수 초기값    
		
		while(true) {
			
			i=i+1; //i++
			
			if( (i%6==0) && (i%14==0) ) {  //6의 배수 이면서  14의 배수 입니까? yes -->숫자찍고 끝(반복문탈출)
				System.out.println(i);
				break;
			}
			
			System.out.println("aaaa");
			
		}

	}

}
