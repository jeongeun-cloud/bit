/*
 *  0~100 사이 점수는 실행하고, 그 외에는 Error! 이거나 다시 실행
 *  A+ A  A- 형식으로 점수가 표시되게
 *  변수 추가하거나 수정하는 것은 자유
 *  
 *  매일 기본 과제 : 
 *  1) 그날 배운거 정리해서 카페에 올리기
 *  2) 내일 배울 내용 예습하기
 *  
 */

package org.comstudy21.ch02;

import static org.comstudy21.ch02.Ch02Ex02.scan;

public class ScoreEx01 {
	static int score;
	static String grade ="F";
	
	public static void main(String[] args) {
		System.out.print("점수 입력 : ");
		score = scan.nextInt();
		if (score >= 0 && score <=100){
		
			if(score >= 90) {
				if(score >=97){
					grade = "A+";
				}else if(score <= 92 && score >= 90 ){
					grade = "A-";
				}else {
					grade = "A";
	
				}

				
			} else if(score >= 80) {
				if(score >=87){
					grade = "B+";
				}else if(score <= 82 && score >= 80){
					grade = "B-";
				}else {
					grade = "B";
	
				}

			} else if(score >= 70) {
				if(score >=77){
					grade = "C+";
				}else if(score <= 72 && score >=70){
					grade = "C-";
				}else {
					grade = "C";

				}
				
			} else if(score >= 60) {
				if(score >=67){
					grade = "D+";
				}else if(score <= 62 && score >=60){
					grade = "D-";
				}else {
					grade = "D";
	
				}
				
			} else {
	
			}
			
			System.out.println(score+"점수의 학점은 "+ grade + "입니다");
		
		}else{
			System.out.println("에러입니다. 0~100안의 수로 다시 입력해주세요");
			main(null);
		}
	
	}
}
