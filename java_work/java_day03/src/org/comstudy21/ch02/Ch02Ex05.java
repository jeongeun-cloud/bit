package org.comstudy21.ch02;

import static org.comstudy21.ch02.Ch02Ex02.scan;

public class Ch02Ex05 {
	static int score;
	static String grade;
	
	public static void main(String[] args) {
	// ������ ���α׷��� <===> ��ü���� ���α׷���
		
		System.out.print("���� �Է� : ");
		score = scan.nextInt();
		//��ȿ�� �˻�
		// 0���� �۰ų� 100���� ũ�� �ٽ� �Է� �Ǵ� Error!
		
		while (score<0 || score>100){
			System.out.println("Error! �ٽ� �Է��ϼ���");
			//System.exit(0); // ���μ����� �����Ѵ�.
			//main(null); 
			System.out.print("���� �Է� : ");
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
			int tmp = score % 10; // ������ ������ 1�� �ڸ��� ����ȴ�.
			if(tmp >= 7) {
				grade += "+";
			} else if (tmp <= 2){
				grade += "-";
			}
			
		}
		
		System.out.printf("%d���� %s�����Դϴ�.", score, grade);
		
	}
}



