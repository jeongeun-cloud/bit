package org.comstudy21.ch03;

public class Ch03Ex35 {

	static void add(int start, int end){
		int total = 0;
		for(int i=start; i<=end; i++){
			
			if(i==5){
				return; // 함수를 종료한다. -> total이 출력이 되지 않는다
				//break; // break는 반복문을 빠져 나간다 > total이 출력된다
			}
			
			total += i;
		}
		
		System.out.println("total => " + total);
	}
	
	public static void main(String[] args) {
		System.out.println("함수 실행 전");
		add(1, 10); // 1부터 10까지의 누적
		System.out.println("함수 실행 후");
		
	}

}
