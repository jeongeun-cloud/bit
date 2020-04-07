package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex07Homework {
	static Scanner scan = new Scanner(System.in);
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	static int month = 0;
	static int day = 0;
	static int total = 0;	
	
	
	public static void main(String[] args) {
		// 과제
		// 월, 일 입력 받아서
		// 월, 일의 100일 후 날짜를 출력하세요
		// 월 입력 : 11
		// 일 입력 : 30
		// >>>> 11월 30일의 100일 후는 3월 9일입니다.
		
		System.out.print("월을 입력 하세요 : ");
		month = scan.nextInt();
		System.out.print("일을 입력하세요 : ");
		day = scan.nextInt();
		
		total = days[month-1] - day; // 남은 일 = 원래 일 - 입력 일
		total -= 100;
		
		System.out.println(total);
		
		for(int i=month-1; i<month+2; i++){
			total += days[i];
			System.out.println(total);
			
			if(month == 12){
				month = 1;
				month ++;
			}
			
		}
		System.out.println(month);
//		System.out.printf("%d월 %d일부터 100일 후의 날짜는 %d월%d일 입니다", month, day,);
		
			
			
		
		
	}
	
	
	
	public static void test2(String[] args) {
		// 월, 일 입력 받아서
		// 월~일 부터 1년의 남은 날짜를 계산하는 프로그램
		// for-each 사용하지 말고 하세요
		
		System.out.print("월을 입력 하세요 : ");
		month = scan.nextInt();
		System.out.print("일을 입력하세요 : ");
		day = scan.nextInt();
		
		total = days[month-1] - day; // 합계 = 원래 일 - 입력 일
				
		for(int i=month; i<days.length; i++){
			total += days[i];

		}
		System.out.printf("올해 남은 날짜는 %d일 입니다",total);
		
	}
	
	
	public static void test(String[] args) {

		// total에 days의 요소값을 누적한다.
		// 1년은 365일 입니다. 출력하기
		for(int d : days){
			total += d;
		}
		System.out.printf("1년은 %d달입니다. \n", days.length);
		System.out.println("1년은 "+total+"일 입니다.");
		
	}
}
