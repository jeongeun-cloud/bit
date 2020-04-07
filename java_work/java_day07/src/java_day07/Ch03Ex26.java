package java_day07;

import java.util.Arrays;
import java.util.Random;


// 과제 : 로또번호 생성기 3개 이상 만들기

public class Ch03Ex26 {
	public static Random rand = new Random();
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++){
			lotto[i] = 1 + rand.nextInt(45); 
			
			// 중복 체크하는 문장을 추가하세요
			for(int j=0; j<i; j++){
				if(lotto[j] == lotto[i]) {
					lotto[i] = 1 + rand.nextInt(45); 
					j = -1; 
				}
			}
		}
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
}
