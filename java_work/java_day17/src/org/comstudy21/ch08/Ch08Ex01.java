package org.comstudy21.ch08;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ch08Ex01 {
	
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		System.out.println("�����͸� �Է��ϼ���. �������� [Ctrl]+Z�� ��������.");
		
		int data = 0;
		while((data = in.read())!= -1) {
			out.write(data);
		}
	}
	

	public static void test(String[] args) throws IOException {
		int data = 0;
		System.out.println("�����͸� �Է��ϼ���. �������� [Ctrl]+Z�� ��������.");
		while((data = System.in.read()) != -1) {
			System.out.print((char)data);
		}
	}

}
