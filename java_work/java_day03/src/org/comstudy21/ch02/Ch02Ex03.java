package org.comstudy21.ch02;

public class Ch02Ex03 {

	public static void main(String[] args) {
		// Math Ŭ���� : ������ ������ �����Ѵ�.
		/*
		 * ���̻�� : Math.PI
		 * E ���: Math.E
		 * �¼� : Math.pow(number1, number2)
		 * ������ : Math.sqrt(number)
		 * �ִ밪 : Math.max(number1, number2)
		 * �ּҰ� : Math.min(number1, number2)
		 * ������ : Math.random() // 1���� ���� ����
		 * ���밪 : Math.abs(number)
		 * Math.cell(), Math.sin(), Math.cos() ...
		 * 
		 */
		
		// random() �Լ��� static���(Ŭ���� ���)�̹Ƿ� 
		// Ŭ���� �̸����� �ٷ� ���� �����ϴ�.
		double number = Math.random();
		int num = 1 + (int)(number * 100);
		
		System.out.println("number => " + num);
		
		

	}

}
