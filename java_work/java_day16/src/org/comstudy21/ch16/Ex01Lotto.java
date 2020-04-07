package org.comstudy21.ch16;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex01Lotto {
	
	public static void main(String[] args) {
		// 문제 : Set을 이용해서 Lotto번호 생성기를 만들어 본다.
		Set<Integer> lotto = new HashSet<>();
		Random rand = new Random();
		
		// 1~6까지의 숫자를 넣어서 테스트하고 1~45로 변경
		// 조건은 lotto.size()를 이용해서 만든다.
				
		while(lotto.size()<6) {
			lotto.add(rand.nextInt(45)+1);
		}
		System.out.println(lotto);
	}
}
