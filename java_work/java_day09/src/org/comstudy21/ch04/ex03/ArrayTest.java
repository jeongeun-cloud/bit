package org.comstudy21.ch04.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �������� 3�� �غ�
		People[] pArr = new People[3];
		
		// People ��ü�� �����͸� �����ϰ� ����϶�.
		// 3���� ����� ��ȭ��ȣ�� �Է� �޾Ƽ� pArr �迭�� �����Ѵ�.
		
		for(int i=0; i<pArr.length; i++){
			// ��� 1.
			// pArr[i] = new People();
			// pArr[i].setIdx(i);
			
			
			// 1. People ��ü�� �����.
			People p = new People();
			
			// 2. People ��ü�� ���� �ִ´�.
			p.setIdx(i);
			System.out.print("���� �Է� : ");
			p.setName(scan.next());
			System.out.print("��ȭ��ȣ : ");
			p.setPhone(scan.next());
			
			// 3. People ��ü�� pArr�� �߰��Ѵ�.
			pArr[i] = p;
			
		}
		
		System.out.println(Arrays.toString(pArr));
		
	}

}
