package org.comstudy21.ch03;

public class Ch03Ex03 {
	
	public static void main(String[] args) {
		int[]scoreArr = null; // int �迭 Ÿ���� ��������
		int total = 0;
		double avg = 0;
		
		// �迭 Ÿ���� ���������� �迭�� �����Ѵ�.
		scoreArr = new int[]{85, 90, 75, 100, 95};
		
		// scoreArr �迭�� ��ҵ��� ���� total�� �����ϰ�
		// ����� avg�� �����ؼ� ����Ѵ�.
		for (int i=0; i<scoreArr.length; i++){
			total += scoreArr[i];
		}
		avg = total/scoreArr.length;
		
		System.out.printf("������ %d �Դϴ�\n",total);
		System.out.printf("����� %.1f �Դϴ�", avg);
	}

	
	
	public static void test(String[] args) {
		
		// �迭�� ����� ���ÿ� �ʱ�ȭ�Ѵ�(�迭 ���ͷ� ���)
		int[] a = {85, 90, 75, 100, 95}; 
		
		// ���ͷ��� �ʱ�ȭ �� ���� ��� ����. ����,
		// int a;
		// a = {85, 90, 75, 100, 95} �� �Ұ���
		
		// new ������ �̿��ϸ� ����
		// ���� �� �� �ֱ� - �Լ��� ���ڷ� �迭 ���ͷ��� ����� ��
		int[] y;
		y = new int[]{85, 90, 75, 100, 95};
		
		// main �Լ��� �Ű������� �迭�̴�.
		// main(new String[]{"kim","����","���α׷���"});
		
		String[] strArr = {"kim","����","���α׷���"};
		test(strArr);
		
	}

}
