package org.comstudy21.ch02;

public class Ch02Ex20 {
	
// �Ǻ���ġ ����
// 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54

	public static void test(String[] args) {
		final int max = 21;
		int prev=0, cur=1, next=0;		
		int total = 0;
		
		for(; cur<=max;){
			System.out.print(cur + (cur==max? "=" : "+"));
			total += cur;
			next = prev + cur;
			prev = cur;
			cur = next;
			
		}
		System.out.print(total);
	}
	
	
	
// 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14 	
// �����ϸ� �����͸� �ǵ����� ���� ���ο� ������ �ϳ� �����Ͽ� �ϱ�, ex) boolean
	public static void main(String[] args) {
		final int max = 21;
			
		int total = 2; // ����
		boolean flag = true;
		
		for(int prev=0, cur=1, next=0; cur<=max; next = prev + cur, prev = cur, cur = next){
			System.out.print(cur);

			if(flag){
				total -= cur;
				System.out.print("+");
				flag = false;
			}else{
				total +=cur;
				System.out.print(cur==max?"=":"-");
				flag = true;
			}
			
		}
		System.out.print(total);
		
	}

}
