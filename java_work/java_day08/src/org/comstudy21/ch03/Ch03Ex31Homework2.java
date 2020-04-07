package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex31Homework2 {
	static int[][] arr = new int[5][5];
	static int num = 1;
	
	// ����Ʈ ��� �Լ�
	public static void printArr() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]==0?" \t":arr[i][j] + "\t");	
			
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.print("���� ��ȣ �Է� : ");
		switch(new Scanner(System.in).nextInt()){
		case 6 : test06(); break;
		case 7 : test07(); break;
		case 8 : test08(); break;
		case 9 : test09(); break;
		default : System.out.println("�����ϴ�/1");
		}
	}
	
	
	
	public static void test06() {
		//	1	2	3	4	5		
		//		6	7	8
		//			9	
		//		10	11	12		
		//	13	14	15	16	17
		
		
		for(int i=0; i<5; i++){	
			int start = i<2? i : 4-i;
			int end = i<2? 4-i : i;
			
			for(int j=start; j<=end; j++){
				arr[i][j] = num++;
			}
		}
		printArr();
		
	}
	
	
	
	public static void test07() {
		//	1				13
		//	2	6		10	14
		//	3	7	9	11	15
		//	4	8		12	16
		//	5				17	
		
		
		for(int i=0; i<5; i++){	
			int start = i<2? i : 4-i;
			int end = i<2? 4-i : i;
			
			for(int j=start; j<=end; j++){
				arr[j][i] = num++;
			}
		}
		printArr();
	}
	
	

	public static void test08() {
		//	1	2	3	4	5
		//	6	7	8	9
		//	10	11	12
		//	13	14	15	16
		//	17	18	19	20	21		
		
		for(int i=0; i<5; i++) {	
			int end = i<2 ? 4-i: i;
			for(int j=0; j<=end; j++){
				arr[i][j] = num++;
			}
		}
		printArr();
	}

	
	
	
	public static final int right = 0;
	public static final int down = 1;
	public static final int left = 2;
	public static final int top = 3;
	
	public static void test09() {
		
		//	1	2	3	4	5
		//	16	17	18	19	6
		//	15	24	25	20	7
		//	14	23	22	21	8
		//	13	12	11	10	9
		
		// 0 : j�� �����Ѵ�.
		// 1 : i�� �����Ѵ�.
		// 2 : j�� �����Ѵ�.
		// 3 : i�� �����Ѵ�.
		
		// j�� i�� 5�̸� case���� �ٲ��.
		// j�� 0�̸� case�� �ٲ��.
		// �����Ϸ��� �ϴ� ��ġ�� �̹� ���� �ִٸ� case�� �ٲ��.
		// num�� 25�� �Ǹ� ������.
		

		int number = 1;
		int no = right;
		int i=0, j=0;
		int cnt = 0;
		
		while(cnt < 25){

			switch(no){
			case right : 
				arr[i][j++] = number++;
				if(j==5 || arr[i][j] !=0 ){
					no = down;
					j--;
					i++;
				}
				break;
			case down :
				arr[i++][j] = number++;
				if(i==5  || arr[i][j] !=0){
					no = left;
					i--;
					j--;
				}
				break;
			case left :
				arr[i][j--] = number++;
				if(j == -1 || arr[i][j] !=0){
					no = top;
					j++;
					i--;
				}
				break;
			case top :
				arr[i--][j] = number++;
				if(arr[i][j] !=0 ){
					no = right; 
					i++;
					j++;
				}
				break;
			}
		
			cnt++;
		}
		
		printArr();
	}

}
