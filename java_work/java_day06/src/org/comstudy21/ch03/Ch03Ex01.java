package org.comstudy21.ch03;

public class Ch03Ex01 {

	public static void main(String[] args) {
		int[] a ; // int �迭 ���� ���� ���� ����	
		a = new int[5]; // 5���� ��Ҹ� �Ҵ��g��	//�� �� ���� ���� int[] a = new int[5];
		
		// �Ҵ�� �迭�� ��ҿ� ���� �����Ѵ�.
		a[0] = 50;
		a[1] = 100;
		a[2] = 150;
		a[3] = 200;
		a[4] = 250;

//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
		
		// ÷�ڴ� ��� ��� ������ ��� ���� ��
//		int i = 0;
//		System.out.println(a[i++]);
//		System.out.println(a[i++]);
//		System.out.println(a[i++]);
//		System.out.println(a[i++]);
//		System.out.println(a[i++]);
		
		for(int i=0; i<a.length; i++){
			System.out.printf("a[%d] => %d\n", i, a[i]);
		}
	}

}
