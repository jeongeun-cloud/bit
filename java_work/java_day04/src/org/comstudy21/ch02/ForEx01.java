package org.comstudy21.ch02;

public class ForEx01 {
	static final int end = 10;
	
	public static void main(String[] args) {
		int total = 2;
		for(int i=1; i<=end; i++){
			System.out.print(i);
			
			if(i%2==1) {
				System.out.print("+");
				total -= i;
			}else{
				System.out.print(i==end?"=":"-");
				total += i;
			}
		}
		System.out.println(total);
	}
	
	
	
	public static void test(String[] args) {
		//1+2-3+4-5+6-7+8-9+10=7 Ãâ·Â µÇ°Ô²û
		
		int total = 0;
		
		
		for(int i=1; i<=end; i++){
			
			
			if (i == 1){
				total += i;
				System.out.print(i);
			}else if(i%2 == 0) {
				total += i;
				System.out.print("+"+i);
			}else if(i%2 == 1) {
				total -= i;
				System.out.print("-"+i);
			} 
			
			if (i == end){
				System.out.print("=");
			}
	
		}
			
		
		System.out.println(total);
		
			
	}
}
