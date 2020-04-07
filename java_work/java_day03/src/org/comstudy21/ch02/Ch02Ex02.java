package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex02 {
	// (클래스) 멤버 필드
	static Scanner scan = new Scanner(System.in);
	
	// (클래스) 멤버 메소드
	public static void main(String[] args) {
		int score = 0;
		
		// 성적을 입력 받아서 80점 이상이면 Pass		
		System.out.print("성적 입력 : ");
		score = scan.nextInt(); //static 멤버는 static 멤버만 호출 가능
		
		
		if(score >= 80){
			System.out.println("Pass");
			System.out.println("프로그램 종료!");
		} else {
			main(null);
		}
			
		
		//System.out.println("프로그램 종료!");

	}

}
