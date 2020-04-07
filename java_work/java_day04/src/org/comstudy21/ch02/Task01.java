package org.comstudy21.ch02;

public class Task01 {

	// 주말 과제 1
	
	//*********
	//**** ****
	//***   ***
	//**     **
	//*       *
	//**     **
	//***   ***
	//**** ****
	//*********
	  	
		
	public static void main(String[] args) {
		
		int end = 1;
		
		for(int i=0; i<9; i++){
			for(int j=0; j<6-end; j++){
				System.out.print("*");
			}
			for(int j=0; j<(end-1)*2-1; j++){
				System.out.print(" ");
			}
			for(int j=0; j<6-end; j++){
				System.out.print("*");
				if(j == end+2){
					break;
				}
			}

			System.out.println();
			end = (i<4) ? end+1 : end-1;

		}
	}
	
	
	
}
