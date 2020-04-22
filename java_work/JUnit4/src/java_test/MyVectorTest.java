package java_test;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class MyVectorTest {

	@Test
	public void addTest() {
		MyVector v = new MyVector();
		
		for(int i=0; i<1000; i++) {
			v.add(""+i);
		}
	
//		System.out.println(v);
//		System.out.println(v.capacity());
		
	}
	
	
	@Test
	public void indexOfTest() {
		MyVector v = new MyVector();
		
		for(int i=0; i<10; i++) {
			v.add(""+i);
		}
	
		System.out.println(v);
		System.out.println(v.indexOf("7777"));
		assertTrue(v.indexOf("7")== 7);
		assertTrue(v.indexOf("77777")== -1);
		v.remove("2");
		System.out.println(v);
		v.remove("d");
		
	}
	
}
