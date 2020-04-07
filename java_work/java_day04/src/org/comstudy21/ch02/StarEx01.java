package org.comstudy21.ch02;


public class StarEx01 {

// 과제 1.
//    *   
//   ***
//  *****
// *******
//*********	

	public static void num1(String[] args) {

			for(int i=0; i<5; i++){
				
				for(int j=0; j<4-i; j++){
					System.out.print(" "); 
				}
				for(int j=0; j<(2*i)+1; j++){ 
					System.out.print("*"); 
				}
				
				System.out.println();
				
			}

		
	}
	

// 과제 2.
//*********
// *******
//  *****
//   ***
// 	  *
	
	public static void num2(String[] args) {
		
		for(int i=0; i<5; i++){
			
			for(int j=0; j<i; j++){
				System.out.print(" "); 
			}
			for(int j=0; j<2*(5-i)-1; j++){
				System.out.print("*"); 
			}
			
			System.out.println();
			
		}
	}
	
	
// 과제 3.

//    *       
//   ***      
//  *****     
// *******    
//*********   
// *******    
//  *****     
//   ***      
//    *	   
	public static void main(String[] args) {
		
		int cnt = 1;
		for(int i=0; i<9; i++){
			for(int j=0; j<5-cnt; j++){
				System.out.print(" ");
			}
			for(int j=0; j<2*cnt-1; j++){
				System.out.print("*");
			}
			
			System.out.println();
			cnt = i <4 ? cnt+1 : cnt-1;	
		}
		
	}
	
	
	
	
}
