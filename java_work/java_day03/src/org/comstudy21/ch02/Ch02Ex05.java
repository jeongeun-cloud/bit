package org.comstudy21.ch02;

import static org.comstudy21.ch02.Ch02Ex02.scan;

public class Ch02Ex05 {
	static int score;
	static String grade;
	
	public static void main(String[] args) {
	// 절차적 프로그래밍 <===> 객체지향 프로그래밍
		
		System.out.print("점수 입력 : ");
		score = scan.nextInt();
		//유효성 검사
		// 0보다 작거나 100보다 크면 다시 입력 또는 Error!
		
		while (score<0 || score>100){
			System.out.println("Error! 다시 입력하세요");
			//System.exit(0); // 프로세스를 종료한다.
			//main(null); 
			System.out.print("점수 입력 : ");
			score = scan.nextInt();
		} 
		
		grade = "F";
		
		if(score >= 90) {
			grade = "A";
		} else if(score >= 80) {
			grade = "B";
		} else if(score >= 70) {
			grade = "C";
		} else if(score >= 60) {
			grade = "D";
		} else {

		}
		
		if(!grade.equals("F")) {
			int tmp = score % 10; // 나머지 값으로 1의 자리가 저장된다.
			if(tmp >= 7) {
				grade += "+";
			} else if (tmp <= 2){
				grade += "-";
			}
			
		}
		
		System.out.printf("%d점은 %s학점입니다.", score, grade);
		
	}
}



