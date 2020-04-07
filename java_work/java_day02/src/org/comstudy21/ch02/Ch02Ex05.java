package org.comstudy21.ch02;

import static java.lang.System.out;
import java.util.Scanner;

public class Ch02Ex05 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
				
		double area = 0; // 원의 면적
		double line = 0; // 원의 둘레의 길이
		double r = 0; // 반지름
		final double PI = 3.141592;
		
		// 원의 반지름을 입력 받아서 둘레의 길이와 면적을 출력하는 프로그램
		
		out.print("반지름 입력 : ");
		r = scan.nextDouble();
		area = r * r * PI;
		line = r * 2 * PI;
		
		out.printf("반지름은 %.1f이고, 원의 둘레의 길이는 %.1f이고, 면적은 %.1f 입니다 \n", r , line, area);
		// 원하는 만큼 소수점 반올림 후 출력
		
		// out.print("반지름은 "+r+"이고, 원의 둘레는" +line+"이고, 면적은 "+area+"입니다.");
		// 입력받은 만큼 계산해서 출력
		
	}

}
