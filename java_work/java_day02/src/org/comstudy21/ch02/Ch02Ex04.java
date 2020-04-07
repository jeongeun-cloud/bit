package org.comstudy21.ch02;

import static java.lang.System.out;
import java.util.Scanner;

public class Ch02Ex04 {
	public static void main(String [] args){
		// Scanner를 이용해서 가로길이, 세로길이를 입력 받아서 
		// 직사각형의 넓이를 출력하는 프로그램 구현하라.
		// 지역변수는 선언시 초기화 필수
		
		// 변수 선언 
		double width = 0, height = 0;
				
		// Scanner 객체 선언
		Scanner scan = new Scanner(System.in);
		
		out.print("가로 입력 : ");
		width = scan.nextDouble();
		out.print("세로 입력 : ");
		height = scan.nextDouble();
		
		out.printf("가로 길이는 %.1f이고, 세로 길이는 %.1f입니다. \n이 직사각형의 넓이는 %.1f 입니다.", width, height, width*height);
		
		
	}
}
