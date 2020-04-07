package org.comstudy21.ch01;

public class Day02Ex01 {

	public static void main(String[] args){
		
		System.out.print("성명 : "); //줄바꿈 생략
		System.out.println("홍길동");
		
		//형식지정자 (변환문자열)
		/**
		 * %s - 문자열 변환 
		 * %d - 정수 변환
		 * %i - 정수 변환
		 * %f - 실수 변환
		 */
		
		System.out.printf("성명:%s, 나이:%d", "이순신", 26);
		System.out.println(); //개행문자만 출련된다.
		System.out.println("---- 출력 완료 ----");
	}
}
