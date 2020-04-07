package java_day06;

import java.util.Scanner;

public class Day05Homework {
	static Scanner scan = new Scanner(System.in);
	
	// ��ȣ() �ȿ� �Ű����� ����
	static void println(String message){ 
		System.out.println(message);
	}
	
	static void print(String message){
		System.out.print(message);
	}
	
	public static void main(String[] args) {
		int a, b, c;
		int max, mid, min;
		
		// �Ű� ������ �μ� ����
		// ��Ŭ���� ���� ����Ű : Ctrl + Alt + ����Ű
		// �̵� : Alt + ����Ű
		// �� ���� : Ctrl + D
		print("���� �Է� 1 : ");
		a = scan.nextInt();
		print("���� �Է� 2 : ");
		b = scan.nextInt();
		print("���� �Է� 3 : ");
		c = scan.nextInt();
		
		System.out.printf("�Է� �� : %d, %d, %d\n", a, b, c);
		// �ϴ�, �� ���� ���ؼ� ū �Ͱ� ���� ���� �з��Ѵ�.
		// ���� ���� ū �Ͱ� ���ؼ� �� ũ�� ���� ���� ���� ū �� 
		// �ƴϸ� ���� ���� ���ؼ� ���� �� ���� ������ ���� ���� �� ���� ��
		// �ܼ�ȭ �ϴ� ���� ����̴�. (�� �� �ִ� �ͺ��� ����)
		
		if(a>b){
			max = a;
			min = b;
		} else {
			max = b;
			min =a;
		}
		// ��� ����� ���� �����Ѵ�.
		if(c>max){
			mid = max;
			max = c;
		} else {
			if(c<min){
				mid = min;
				min = c;
			} else {
				mid = c;
			}
		}
		System.out.println("max : " + max);
		System.out.println("mid : " + mid);
		System.out.println("min : " + min);
		
	}

	
	
	public static void homework01(String[] args) {		
		// �ָ� ���� 1   cnt  (9-cnt)
		
		// *********	5	4
		// **** ****	4	5
		// ***   ***	3	6
		// **     **	2	7
		// *       *	1	8
		// **     **	2	7
		// ***   ***	3	6
		// **** ****	4	5
		// *********	5	4
		
		// for���� 9ȸ�� �ϸ鼭 5,4,3,2,1,2,3,4,5 ��� �ǵ��� �Ѵ�.
		int cnt = 5;
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				System.out.print(j<cnt || j>=9-cnt?"*":" ");
			}
			
			System.out.println();
			cnt = i<4?cnt-1 : cnt+1;
		}
		
	}
}
