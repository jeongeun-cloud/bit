package org.comstudy21.ch03;

public class Ch03Ex35 {

	static void add(int start, int end){
		int total = 0;
		for(int i=start; i<=end; i++){
			
			if(i==5){
				return; // �Լ��� �����Ѵ�. -> total�� ����� ���� �ʴ´�
				//break; // break�� �ݺ����� ���� ������ > total�� ��µȴ�
			}
			
			total += i;
		}
		
		System.out.println("total => " + total);
	}
	
	public static void main(String[] args) {
		System.out.println("�Լ� ���� ��");
		add(1, 10); // 1���� 10������ ����
		System.out.println("�Լ� ���� ��");
		
	}

}
