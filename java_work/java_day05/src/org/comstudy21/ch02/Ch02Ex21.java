package org.comstudy21.ch02;

public class Ch02Ex21 {
	public static void ex01(String[] args) {
		// 1부터 10까지 합 구하기 (for문 이용)
		
		final int max =10;
		int total = 0;
		
		for(int i=1; i<=max; i++){
			System.out.print(i+(i==max?"=":"+"));
			total += i;
		}
		
		System.out.println(total);
		
	}
	
	public static void main(String[] args) {
		// 1부터 10까지 합 구하기 (while 이용)
		
		final int max =10;
		int total = 0;
		
		int i = 1 ; //초기값	
		while(i <= max){ // 비교
			System.out.print(i+(i==max?"=":"+"));
			total += i;
			i++; // 증감식 
		}
		
		System.out.println(total);
		
	}
	
	

}
