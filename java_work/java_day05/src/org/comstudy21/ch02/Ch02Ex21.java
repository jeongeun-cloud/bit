package org.comstudy21.ch02;

public class Ch02Ex21 {
	public static void ex01(String[] args) {
		// 1���� 10���� �� ���ϱ� (for�� �̿�)
		
		final int max =10;
		int total = 0;
		
		for(int i=1; i<=max; i++){
			System.out.print(i+(i==max?"=":"+"));
			total += i;
		}
		
		System.out.println(total);
		
	}
	
	public static void main(String[] args) {
		// 1���� 10���� �� ���ϱ� (while �̿�)
		
		final int max =10;
		int total = 0;
		
		int i = 1 ; //�ʱⰪ	
		while(i <= max){ // ��
			System.out.print(i+(i==max?"=":"+"));
			total += i;
			i++; // ������ 
		}
		
		System.out.println(total);
		
	}
	
	

}
