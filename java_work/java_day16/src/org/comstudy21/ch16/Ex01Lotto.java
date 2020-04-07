package org.comstudy21.ch16;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex01Lotto {
	
	public static void main(String[] args) {
		// ���� : Set�� �̿��ؼ� Lotto��ȣ �����⸦ ����� ����.
		Set<Integer> lotto = new HashSet<>();
		Random rand = new Random();
		
		// 1~6������ ���ڸ� �־ �׽�Ʈ�ϰ� 1~45�� ����
		// ������ lotto.size()�� �̿��ؼ� �����.
				
		while(lotto.size()<6) {
			lotto.add(rand.nextInt(45)+1);
		}
		System.out.println(lotto);
	}
}
