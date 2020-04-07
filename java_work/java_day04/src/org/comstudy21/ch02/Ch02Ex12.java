package org.comstudy21.ch02;

public class Ch02Ex12 {
	
	static final int end = 10;
	public static void main(String[] args) {
		//1+2+3+4+5+6+7+8+9+10=55 출력 되게끔
		
		int total = 0;
		
		for(int i=1; i<=end; i++) {
			
			total += i;
			
			
			if(i <end){
				System.out.print(i+"+");
			}else {
				System.out.print(i+"=");
			}
			
		//	System.out.print(i + (i<end?"+":"=")); 이렇게 수정할 수 있음

		}
		
		
		System.out.println(total);
			
		}
	
	
		
	
	
	
//	static int total; // 이렇게 쓸 수 있음. 0으로 자동 초기화 됨
	public static void test() {
		// 1부터 10까지 출력한다.
		
		System.out.println("반복문 시작 전");
		int total = 0; // 누적 변수는 초기화 필수!!
		
		//while 과 for문은 항상 바꿔 쓸 수 있음
		for (int i=1; i<=10; i++){
			
			total += i;
			System.out.println(i);
		}
		
		// total은 i의 증가치의 누적값이다.
		System.out.println("-----------------");
		System.out.println("total =>" + total);
	}

}
