package org.comstudy21.ch02;

public class Ch02Ex12 {
	
	static final int end = 10;
	public static void main(String[] args) {
		//1+2+3+4+5+6+7+8+9+10=55 ��� �ǰԲ�
		
		int total = 0;
		
		for(int i=1; i<=end; i++) {
			
			total += i;
			
			
			if(i <end){
				System.out.print(i+"+");
			}else {
				System.out.print(i+"=");
			}
			
		//	System.out.print(i + (i<end?"+":"=")); �̷��� ������ �� ����

		}
		
		
		System.out.println(total);
			
		}
	
	
		
	
	
	
//	static int total; // �̷��� �� �� ����. 0���� �ڵ� �ʱ�ȭ ��
	public static void test() {
		// 1���� 10���� ����Ѵ�.
		
		System.out.println("�ݺ��� ���� ��");
		int total = 0; // ���� ������ �ʱ�ȭ �ʼ�!!
		
		//while �� for���� �׻� �ٲ� �� �� ����
		for (int i=1; i<=10; i++){
			
			total += i;
			System.out.println(i);
		}
		
		// total�� i�� ����ġ�� �������̴�.
		System.out.println("-----------------");
		System.out.println("total =>" + total);
	}

}
