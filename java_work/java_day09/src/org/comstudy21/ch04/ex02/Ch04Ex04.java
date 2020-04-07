package org.comstudy21.ch04.ex02;

import java.util.Arrays;

public class Ch04Ex04 {

	// Varargs
	public void print(int ...a ) {
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		Ch04Ex04 obj = new Ch04Ex04();
		obj.print(100);
		obj.print(100, 200);
		obj.print(100, 200, 300);
	}
	
	
}
