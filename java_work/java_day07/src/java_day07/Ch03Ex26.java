package java_day07;

import java.util.Arrays;
import java.util.Random;


// ���� : �ζǹ�ȣ ������ 3�� �̻� �����

public class Ch03Ex26 {
	public static Random rand = new Random();
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++){
			lotto[i] = 1 + rand.nextInt(45); 
			
			// �ߺ� üũ�ϴ� ������ �߰��ϼ���
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
