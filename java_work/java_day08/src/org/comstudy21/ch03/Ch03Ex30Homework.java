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
		// 45 ���� ���� �غ��ؼ� �� �߿� 6���� �������� �̾ƿ´�.
		// [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,...] //-1-
		// �̾ƿ��� ����, �� �ڸ��� 0���� �ٲ��ֱ� (lotto�� 0�� �����ϱ�)
		// �̾ƿ� ��, 0�� �ƴϳ� ����
		
		int[] Lotto = new int[6];
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++){
			ball[i] = i+1; // -1- :  1 ���� 45���� �ֱ�
		}
		// for(int i=0; i<ball.length; i++) ball[i] = i+1; �� �� ��� ���� 

		// System.out.println(Arrays.toString(ball)); //[1,2,3,4,...] Ȯ��
		
		for(int i=0; i<Lotto.length;){
			int idx = rand.nextInt(ball.length); // ball�� �����ϳ� �������� idx�� ���� 
			if(ball[idx] !=0 ){  
				Lotto[i] = ball[idx]; // 0�� �ƴϸ� Lotto[i]�� ���� �����ϰ�
				ball[idx] = 0; // ball[idx]�� 0���� �ٲ��ش�
				i++; // ball�� 0�� �ƴҶ��� i ����
			}
		}
		Arrays.sort(Lotto);
		System.out.println(Arrays.toString(Lotto));
		
	}
	
	
	
	
	public static void lotto2(String[] args) {
		
		int cnt = 0;
		while(cnt<6){
			int num = 1 + rand.nextInt(max); // �������� num�� ���� �ֱ�
			boolean flag = true; // flag�� true�� �ʱ�ȭ

			for(int i=0; i<cnt; i++){
				if(num == lotto[i]){ // num�� �� ���ڿ� lotto[i]�� ���ڰ� ������ ��
					flag = false; // ������ flag�� false�� �ٲ��ֱ�
					break; // ���������� -> lotto[cnt]�� ���� ���� ����
				}
			}
			
			if(flag){ // flag�� �״�� true�̸�,
				lotto[cnt] = num; // lotto[cnt]�� num ��ȣ �ֱ�  
				cnt++; // cnt ���� 
			}
		}
		
		Arrays.sort(lotto); // ��������
		System.out.println(Arrays.toString(lotto));
	}
	
	
	
	
	public static void lotto1(String[] args) {
		// �ζǹ�ȣ ������ 1 (j=0���� ���� �� i��°���� ��� �� �� ���� �̱�)
		
		for(int i=0; i<size; i++){
			lotto[i] = 1 + rand.nextInt(max); // lotto[i]�� ���� �� �ֱ�
			for(int j=0; j<i; j++){
				if(lotto[j] == lotto[i]) { // lotto[j]�� ���� lotto[i]�� ���� ������ ��
					lotto[i] = 1 + rand.nextInt(max); // ���λ̱�
					j = -1; // j++�Ǽ� j=0�� �ǵ��� j �ʱ�ȭ
				}
			}
		}
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
}
