package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.Random;

public class Ch03Ex30Homework {
	public static final int size;
	public static final int max;
	public static final Random rand;
	public static final int[] lotto;
	
	static{
		size = 6;
		max = 6;
		rand = new Random();
		lotto = new int[size];
	}
	
	
	
	public static void main(String[] args) {
		// 45 개의 공을 준비해서 그 중에 6개를 무작위로 뽑아온다.
		// [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,...] //-1-
		// 뽑아오고 나서, 그 자리는 0으로 바꿔주기 (lotto에 0은 없으니까)
		// 뽑아올 때, 0이 아니냐 묻기
		
		int[] Lotto = new int[6];
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++){
			ball[i] = i+1; // -1- :  1 부터 45까지 넣기
		}
		// for(int i=0; i<ball.length; i++) ball[i] = i+1; 한 줄 사용 가능 

		// System.out.println(Arrays.toString(ball)); //[1,2,3,4,...] 확인
		
		for(int i=0; i<Lotto.length;){
			int idx = rand.nextInt(ball.length); // ball에 숫자하나 랜덤으로 idx에 저장 
			if(ball[idx] !=0 ){  
				Lotto[i] = ball[idx]; // 0이 아니면 Lotto[i]에 값을 저장하고
				ball[idx] = 0; // ball[idx]는 0으로 바꿔준다
				i++; // ball이 0이 아닐때만 i 증가
			}
		}
		Arrays.sort(Lotto);
		System.out.println(Arrays.toString(Lotto));
		
	}
	
	
	
	
	public static void lotto2(String[] args) {
		
		int cnt = 0;
		while(cnt<6){
			int num = 1 + rand.nextInt(max); // 랜덤으로 num에 숫자 넣기
			boolean flag = true; // flag를 true로 초기화

			for(int i=0; i<cnt; i++){
				if(num == lotto[i]){ // num에 들어간 숫자와 lotto[i]의 숫자가 같은지 비교
					flag = false; // 같으면 flag를 false로 바꿔주기
					break; // 빠져나오기 -> lotto[cnt]에 값을 넣지 않음
				}
			}
			
			if(flag){ // flag가 그대로 true이면,
				lotto[cnt] = num; // lotto[cnt]에 num 번호 넣기  
				cnt++; // cnt 증가 
			}
		}
		
		Arrays.sort(lotto); // 오름차순
		System.out.println(Arrays.toString(lotto));
	}
	
	
	
	
	public static void lotto1(String[] args) {
		// 로또번호 생성기 1 (j=0부터 값이 들어간 i번째까지 계속 비교 후 새로 뽑기)
		
		for(int i=0; i<size; i++){
			lotto[i] = 1 + rand.nextInt(max); // lotto[i]에 랜덤 값 넣기
			for(int j=0; j<i; j++){
				if(lotto[j] == lotto[i]) { // lotto[j]의 값과 lotto[i]의 값이 같은지 비교
					lotto[i] = 1 + rand.nextInt(max); // 새로뽑기
					j = -1; // j++되서 j=0이 되도록 j 초기화
				}
			}
		}
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
}
