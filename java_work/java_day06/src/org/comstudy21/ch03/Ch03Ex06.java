package org.comstudy21.ch03;

public class Ch03Ex06 {
	enum Week {��, ȭ, ��, ��, ��, ��, ��};
	
	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5};
		String[] names = {"���","��","�ٳ���","ü��","����","����"};
		int sum = 0;
		
		// for-each ��
		// for(Ÿ�� ����(��Ұ� �� �ӽú���) : �迭 ����) {
		//
		// }

		for(int k : num){
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("���� " +sum);
		
		for (String s : names){
			System.out.print(s + " ");
		}
		System.out.println();
		
		for (Week day : Week.values()){
			System.out.print(day + "���� ");
		}
		System.out.println();
	}
}
