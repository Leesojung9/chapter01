package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {

		
		/* println() 사용법 */
		System.out.print("안녕");
		System.out.println("하세요");
		System.out.println("안녕하세요");
		System.out.println("==========================================");
	
		//println() 사용법
		int i = 2345;
		double d =3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		String name = "이소정";
		
		System.out.println("안녕하세요"); //안녕하세요
		System.out.println(str); //굿모닝
		System.out.println(i); //2345
		System.out.println(d); //3.14
		
		System.out.println(str+str); //굿모닝굿모닝
		System.out.println(str+i); //굿모닝2345		
		System.out.println(str+d); //굿모닝3.14

		System.out.println(str+" 이랑 "+i); //굿모닝 이랑 2345
		System.out.println(i+i); //4690
		System.out.println(i+d); //2348.14 원래는 값이 안 나와야 맞는데, 자동형변 돼서(정수가 실수로) 정상적인 값이 나온 것.
		
		System.out.println(c+c); //char로 줬던 변수값을 서로 더하니 이상한 숫자값이 나옴 
		System.out.println(c+s); //한한		
	
		System.out.println("제 이름은 " + name + " 입니다.");  //제 이름은 이소정 입니다.
		System.out.println("안녕\"하\"세요"); //안녕"하"세요
		System.out.println("안녕\\하\\세요"); //안녕\하\세요
		System.out.println("안녕\t하세요") ; //안녕        하세요
		
		
	
	}
}
