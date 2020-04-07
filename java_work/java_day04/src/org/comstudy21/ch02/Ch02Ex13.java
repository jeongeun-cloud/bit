package org.comstudy21.ch02;

public class Ch02Ex13 {
	
	public static void main(String[] args) {
		//^^^^* 
		//^^^**  
		//^^*** 
		//^**** 
		//***** 
		//^**** 
		//^^*** 
		//^^^** 
		//^^^^* 
		
		int end = 4;
		for(int i=0; i<9; i++){
			for(int j=0; j<5; j++){
				System.out.print(j<end? "^":"*");
			//	System.out.print("^");
					
			}
			
			System.out.println();
			end = i <4 ? end-1 : end+1;
		}
		
		
		
	}
	
	public static void test5(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *
		
		int end = 1;
		for(int i=0; i<9; i++){
			for(int j=0; j<end; j++){
				System.out.print("*");
			}
			
			System.out.println();
			end = (i<4) ? end+1 : end-1;

		}

		
	}
	
	
	
	
	
	public static void test4(String[] args) {
		// *****
		// ^****
		// ^^***
		// ^^^**
		// ^^^^*
		
		for(int i=0; i<5; i++){

			for(int j=0; j<i ;j++){
				System.out.print("^");
			}
			
			for(int j=0; j<5-i ; j++){ 
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void test3(String[] args) {
		// ^^^^*
		// ^^^**
		// ^^***
		// ^****
		// *****
		
		// 规过 1.
		for(int i=0; i<5; i++){  
			for(int j=0; j<4-i ; j++){ 
				System.out.print("^");
			}
			
			for(int j=0; j<i+1; j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		// 规过 2.
		System.out.println();
		for(int i=0; i<5; i++){  
			for(int j=0; j<5 ; j++){ 
				System.out.print(j<4-i?"^":"*");
			}
			System.out.println();
			
		}
		
		
		
	}
	
	public static void test2(String[] args) {
		
		// 规过 1.
		for(int i=0; i<5; i++){  
			for(int j=5; j>i ; j--){ 
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println();
		// 规过 2.
		for(int i=0; i<5; i++){  
			for(int j=0; j<5-i ; j++){ 
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	
	
	
	
	public static void test(String[] args) {
		
		// 促吝 for巩
		// 喊 弊覆 免仿

		for(int i=0; i<5; i++){  //青 
			for(int j=0; j<i+1; j++){ //凯
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}
}
