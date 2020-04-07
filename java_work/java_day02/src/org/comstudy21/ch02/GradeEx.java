package org.comstudy21.ch02;

import java.util.Scanner;

public class GradeEx {
	
	public static void main(String[] args){
	// 성명, 국어, 영어, 수학 점수를 입력 받아서 총점, 평균을 출력하는 프로그램을 만들어라	
		
		// 객체 선언
		Scanner scan = new Scanner(System.in);
		
		// 변수 선언
		String name = "";
		int ko = 0, en = 0, math = 0;
		int sum = 0;
		int avg = 0;
		
		System.out.print("이름을 입력하세요 : ");
		name = scan.nextLine();
		
		System.out.print("국어 점수 입력 : ");
		ko = scan.nextInt();
		System.out.print("수학 점수 입력 : ");
		en = scan.nextInt();
		System.out.print("영어 점수 입력 : ");
		math = scan.nextInt();
		
		sum = ko + en + math;
		avg = sum / 3;
		
		System.out.printf("%s학생의 국어는 %d점, 수학은 %d점, 영어는 %d점 입니다.\n",name,ko,en,math);
		System.out.print(name+"학생의 모든 점수의 합은"+sum+"이고, 평균은 "+avg+"점 입니다.");
		
	}

}
