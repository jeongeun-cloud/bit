package org.comstudy21.ch02;
/**
 * print(), println(), printf() g함수를 적절히 사용해서 다음 내용 출력
 * 1. 성명
 * 2. 나이
 * 3. 사는곳
 * 4. 전공
 * 5. 직업
 * 6. 특기
 * 7. 키
 * 8. 시력
 * 9. 혈액형
 * 10. 장래희망
 *
 */

import java.util.Scanner;

public class IntroEx {
	public static void main(String[] args){
	// --- 자기소개에 출력 할 데이터를 입력받아서 출력하는 프로그램 만들기
		
		// 객체 선언
		Scanner scan = new Scanner(System.in);
		
		// 변수 선언
		String name = "", address = "",  major ="",  job="", special="", blood="", dream="" ;
		int age = 0 ;
		double sight = 0, hieght = 0;
		
		System.out.print("이름을 입력하세요 :");
		name = scan.next();
		System.out.print("나이를 입력하세요 :");
		age = scan.nextInt();
		System.out.print("사는 곳을 입력하세요 :");
		address = scan.next();
		System.out.print("전공을 입력하세요 :");
		major = scan.next();
		System.out.print("직업을 입력하세요 :");
		job = scan.next();
		System.out.print("특기를 입력하세요 :");
		special = scan.next();
		System.out.print("키를 입력하세요 :");
		hieght = scan.nextDouble();
		System.out.print("시력을 입력하세요 :");
		sight = scan.nextDouble();
		System.out.print("혈액형을 입력하세요 :");
		blood = scan.next();
		System.out.print("장래희망을 입력하세요 :");
		dream = scan.next();
		
		System.out.println();
		System.out.println("----"+name+"의 자기소개----");
		System.out.println();
		System.out.println("이름 : "+name);
		System.out.printf("나이 : %d \n사는곳 : %s \n전공 : %s \n직업 : %s \n", age, address, major, job);
		System.out.println("특기 : "+special);
		System.out.printf("키 : %.1f \n시력 : %.1f", hieght, sight);
		System.out.print("혈액형 : " + blood + "\n장래희망 : " + dream);
	
	}
}
