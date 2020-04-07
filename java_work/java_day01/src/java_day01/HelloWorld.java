package java_day01;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열 + 문자열 -> 문자열
		// 문자열 + 숫자 -> 문자열 
		// 상수는 프로그램 시작 ~ 끝까지 변하지 않는 값
		// 변수는 메모리 할당을 받아 선언하고 필요에 따라 값을 변경
		
		//기본타입 : 자바의 기본타입 - 8개 (정수 4개, 실수 2개, 문자1개, 논리형1개)
		// 타입 변수이름 = 초기값;
		
		int data = 365;
		String name ="홍길동";
		
		// 문자열과 문자는 다르다.
		// "이것은 문자열 입니다", "14"
		// 'A', 'a', '5' 이것은 문자입니다.
		
		System.out.println("Hello java world!");
		System.out.println("Hello " + name + data + " world");
	}

}