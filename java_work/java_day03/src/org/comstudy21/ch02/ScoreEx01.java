/*
 *  0~100 ���� ������ �����ϰ�, �� �ܿ��� Error! �̰ų� �ٽ� ����
 *  A+ A  A- �������� ������ ǥ�õǰ�
 *  ���� �߰��ϰų� �����ϴ� ���� ����
 *  
 *  ���� �⺻ ���� : 
 *  1) �׳� ���� �����ؼ� ī�信 �ø���
 *  2) ���� ��� ���� �����ϱ�
 *  
 */

package org.comstudy21.ch02;

import static org.comstudy21.ch02.Ch02Ex02.scan;

public class ScoreEx01 {
	static int score;
	static String grade ="F";
	
	public static void main(String[] args) {
		System.out.print("���� �Է� : ");
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
			
			System.out.println(score+"������ ������ "+ grade + "�Դϴ�");
		
		}else{
			System.out.println("�����Դϴ�. 0~100���� ���� �ٽ� �Է����ּ���");
			main(null);
		}
	
	}
}
